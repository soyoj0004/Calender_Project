package com.javalab.calendar.Service;

import com.javalab.calendar.dto.UserDto;
import com.javalab.calendar.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto findUserByemail(String email);
    List<UserDto> findAllUsers();
    UserDto updateUser(UserDto userDto);
    void delteUserbyemail(String email);
}
