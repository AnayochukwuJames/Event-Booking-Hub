package com.james.eventbooking_hub.serviceImpl;

import com.james.eventbooking_hub.dto.dto.EventDTO;
import com.james.eventbooking_hub.model.Event;
import com.james.eventbooking_hub.repository.EventRepository;
import com.james.eventbooking_hub.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    @Override
    public ResponseEntity<EventDTO> viewEvent(Long id) {
        Optional<Event> eventOptional = eventRepository.findById(id);

        if (eventOptional.isPresent()) {
            Event event = eventOptional.get();
            EventDTO eventDto = mapEventToEventDto(event);
            return ResponseEntity.ok(eventDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private EventDTO mapEventToEventDto(Event event) {
        EventDTO eventDto = new EventDTO();
        eventDto.setEventTitle(event.getEventTitle());
        eventDto.setEventDescription(event.getEventDescription());
        eventDto.setAvailableTicket(event.getAvailableTicket());
        eventDto.setBannerPath(event.getBanner());
        eventDto.setStartDateTime(event.getStartDateTime());
        eventDto.setEndDateTime(event.getEndDateTime());
        eventDto.setCategory(event.getCategory());
        eventDto.setOrganizer(event.getOrganizer());
        eventDto.setLocation(event.getLocation());
        return eventDto;
    }
}

