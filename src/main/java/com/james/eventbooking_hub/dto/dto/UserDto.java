package com.james.eventbooking_hub.dto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.management.relation.Role;
import java.util.Date;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public class UserDto {

        private String identificationNumber;
        private String firstName;
        private String lastName;
        private String username;
        private Date DOB;
        private String password;
        private String phoneNumber;
        private Role role;
    }


