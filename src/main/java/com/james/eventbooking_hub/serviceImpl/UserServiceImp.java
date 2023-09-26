package com.james.eventbooking_hub.serviceImpl;

import com.james.eventbooking_hub.dto.dto.UserDto;
import com.james.eventbooking_hub.model.User;
import com.james.eventbooking_hub.repository.UserRepository;
import com.james.eventbooking_hub.service.UserService;

import java.util.Calendar;

public class UserServiceImp implements UserService {

    private UserRepository userRepository;
//    @Override
//    public UserDto createUser(UserDto userDto) {
//        User user = new User();
//        user.setUsername(userDto.getUsername());
//        user.setEmail(userDto.getEmail());
//        userRepository.save(user);
//        UserDto createdUserDto = new UserDto();
//        createdUserDto.setId(user.getId());
//        createdUserDto.setUsername(user.getUsername());
//        createdUserDto.setEmail(user.getEmail());

//        return createdUserDto;
//    }
    public static String idGenerator(Long id){
        String userIdentity = String.format("%04",id);
        Calendar calendar = Calendar.getInstance();
        return String.valueOf(calendar.get(calendar.getWeeksInWeekYear()) + "/ESUT/" + String.valueOf("%o4d"));
    }


    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }
}


