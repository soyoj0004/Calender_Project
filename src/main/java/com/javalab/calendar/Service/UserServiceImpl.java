package com.javalab.calendar.Service;

import com.javalab.calendar.dto.UserDto;
import com.javalab.calendar.entity.User;
import com.javalab.calendar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional // 트랜잭션을 클래스 레벨에 적용
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserRepository userRepository;


 /*   @Override
    public UserDto createUser(UserDto userDto) {
        User user = convertToEntity(userDto);
        User savedUser = userRepository.save(user);
        UserDto savedUserDto = converToDto(savedUser);
        return savedUserDto;
    }*/



    @Override
    public UserDto findUserByemail(String email) {
        return null;
    }

    @Override
    public List<UserDto> findAllUsers() {
        return List.of();
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public void delteUserbyemail(String email) {

    }
}
