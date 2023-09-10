package com.james.eventbooking_hub.controller;

import com.james.eventbooking_hub.dto.EventDTO;
import com.james.eventbooking_hub.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/view/{eventId}")
    public ResponseEntity<EventDTO> viewEvent(@PathVariable Long eventId) {
        EventDTO eventDTO = eventService.getEventById(eventId);
        if (eventDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(eventDTO);
    }
}
