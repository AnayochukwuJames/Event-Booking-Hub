package com.james.eventbooking_hub.service;

import com.james.eventbooking_hub.dto.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto createUser(UserDto userDto);

}
