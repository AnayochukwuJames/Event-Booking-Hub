package com.james.eventbooking_hub.controller;

import com.james.eventbooking_hub.dto.dto.UserProfileDto;
import com.james.eventbooking_hub.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping("/api/v1/user-profile")
@RequiredArgsConstructor
public class UserProfileController {
   private final UserProfileService userProfileService;
    @PostMapping("/create")
    public ResponseEntity<UserProfileDto> createUserProfile(@RequestBody UserProfileDto userProfileDto) {

        UserProfileDto createdUserProfile = userProfileService.createUserProfile(userProfileDto);

        if (createdUserProfile != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdUserProfile);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        }
}


