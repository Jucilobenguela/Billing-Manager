package com.billing.services;

import com.billing.convert.ConvertUser;
import com.billing.dtos.UserRegisterDto;
import com.billing.exception.UserNotFoundException;
import com.billing.models.User;
import com.billing.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public void registerUser(UserRegisterDto userRegisterDto){
        User newUser = ConvertUser.converUserRegisterDtoToUser(userRegisterDto);
        newUser.setPassword(encryptPassword(newUser.getPassword()));
        User user = findUserByEmail(newUser.getEmail());
        if(user == newUser){
            throw new UserNotFoundException("Email already exists");
        }
        userRepository.save(newUser);
    }
    private String encryptPassword(String password){
      return bCryptPasswordEncoder.encode(password);
    }
    private User findUserByEmail(String email){
       return  (User) userRepository.findByEmail(email);
    }
}
