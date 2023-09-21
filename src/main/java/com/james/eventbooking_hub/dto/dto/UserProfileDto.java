package com.james.eventbooking_hub.dto.dto;
import com.james.eventbooking_hub.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserProfileDto {
    private User user;
    private String profilePicture;
    private String userDescription;


}
