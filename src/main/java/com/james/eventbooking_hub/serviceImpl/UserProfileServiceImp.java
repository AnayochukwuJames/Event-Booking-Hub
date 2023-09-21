package com.james.eventbooking_hub.serviceImpl;
import com.james.eventbooking_hub.dto.dto.UserProfileDto;
import com.james.eventbooking_hub.model.User;
import com.james.eventbooking_hub.model.UserProfile;
import com.james.eventbooking_hub.repository.UserProfileRepository;
import com.james.eventbooking_hub.repository.UserRepository;
import com.james.eventbooking_hub.service.UserProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserProfileServiceImp implements UserProfileService {

    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;
    public UserProfileServiceImp(UserProfileRepository userProfileRepository,
                                 UserRepository userRepository) {
        this.userProfileRepository = userProfileRepository;
        this.userRepository = userRepository;
    }
    @Override
    public UserProfileDto createUserProfile(UserProfileDto userProfileDto) {
        UserProfile userProfile = new UserProfile();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails =  (UserDetails) authentication.getPrincipal();
        User user =  userRepository.findByUsername(userDetails.getUsername())
                .orElseThrow(()->new NullPointerException("No such user"));
        userProfile.setUser(user);
        userProfile.setProfilePicture(userProfileDto.getProfilePicture());
        userProfile.setUserDescription(userProfileDto.getUserDescription());
        userProfile = userProfileRepository.save(userProfile);
        UserProfileDto createdUserProfile = new UserProfileDto();
        createdUserProfile.setUser(userProfile.getUser());
        createdUserProfile.setProfilePicture(userProfile.getProfilePicture());
        createdUserProfile.setUserDescription(userProfile.getUserDescription());
        return createdUserProfile;
    }
}