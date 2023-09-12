package com.james.eventbooking_hub.serviceImpl;

import com.james.eventbooking_hub.dto.dto.EventDTO;
import com.james.eventbooking_hub.model.Event;
import com.james.eventbooking_hub.repository.repository.EventRepository;
import com.james.eventbooking_hub.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    @Override
    public EventDTO viewEvent(Long id) {
        Event event = eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Event with this ID " + id + " does not exist"));
        return new EventDTO();
    }
}
