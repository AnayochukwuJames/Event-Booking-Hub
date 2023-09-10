package com.james.eventbooking_hub.service;

import com.james.eventbooking_hub.dto.EventDTO;
import com.james.eventbooking_hub.model.Event;
import com.james.eventbooking_hub.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final Repository repository;

    @Autowired
    public EventService(EventRepository eventRepository, Repository repository) {
        this.repository = repository;
        this.eventRepository = eventRepository;
    }

    public EventDTO getEventDTOById(Long eventId) {
        Event event = eventRepository.findById(eventId).orElse(null);
        if (event == null) {
            return null; // You can handle the case when the event is not found
        }

        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventTitle(event.getEventTitle());
        eventDTO.setEventDescription(event.getEventDescription());
        eventDTO.setLocation(event.getLocation());
        eventDTO.setCategory(event.getCategory());
        eventDTO.setBanner(event.getBanner());
        eventDTO.setOrganizer(event.getOrganizer());
        eventDTO.setAvailableTicket(event.getAvailableTicket());
        eventDTO.setTicketSold(event.getTicketSold());
        eventDTO.setStartDateTime(event.getStartDateTime());
        eventDTO.setEndDateTime(event.getEndDateTime());

        return eventDTO;
    }

    public EventDTO getEventById(Long eventId) {
        return null;
    }
}
