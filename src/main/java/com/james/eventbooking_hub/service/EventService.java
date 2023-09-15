package com.james.eventbooking_hub.service;

import com.james.eventbooking_hub.dto.dto.EventDTO;
import org.springframework.stereotype.Service;

@Service
public interface EventService {
    EventDTO viewEvent(Long id);
}

