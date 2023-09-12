package com.james.eventbooking_hub.controller;

import com.james.eventbooking_hub.dto.dto.EventDTO;
import com.james.eventbooking_hub.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/view/event/{id}")
    public ResponseEntity<EventDTO> viewEvent(@PathVariable Long id) {
        return new ResponseEntity<>(eventService.viewEvent(id), HttpStatus.OK);
    }


}
