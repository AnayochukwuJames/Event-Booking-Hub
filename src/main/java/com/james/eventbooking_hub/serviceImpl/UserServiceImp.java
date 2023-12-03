package com.james.eventbooking_hub.serviceImpl;

import com.james.eventbooking_hub.dto.dto.UserDto;
import com.james.eventbooking_hub.model.User;
import com.james.eventbooking_hub.repository.UserRepository;
import com.james.eventbooking_hub.service.UserService;

public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getUsername());
        user.setDOB(userDto.getDOB());
        user.setPassword(userDto.getPassword());
        user.setIdentificationNumber(userDto.getIdentificationNumber());
        user.setPhoneNumber(userDto.getPhoneNumber());
        User savedUser = userRepository.save(user);
        return new UserDto();
    }


}


