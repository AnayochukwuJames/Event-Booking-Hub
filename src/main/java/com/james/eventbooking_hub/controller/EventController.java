package com.james.eventbooking_hub.controller;

import com.james.eventbooking_hub.dto.dto.EventDTO;
import com.james.eventbooking_hub.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {
   public EventService eventService;

    @GetMapping("/view/{eventId}")
    public ResponseEntity<EventDTO> viewEvent(@PathVariable Long eventId) {

        EventDTO eventDto = eventService.viewEvent(eventId).getBody();
        if (eventDto != null) {
            return ResponseEntity.ok(eventDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
