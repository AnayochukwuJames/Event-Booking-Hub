package com.james.eventbooking_hub.service;

import com.james.eventbooking_hub.dto.dto.UserProfileDto;
import org.springframework.stereotype.Service;

@Service
public interface UserProfileService {
    UserProfileDto createUserProfile(UserProfileDto userProfileDto);

}
