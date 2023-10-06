package com.billing.convert;

import com.billing.dtos.UserRegisterDto;
import com.billing.models.User;
public class ConvertUser {

    public static User converUserRegisterDtoToUser(UserRegisterDto userRegisterDto) {

        ValidatorDto.valid(userRegisterDto);
        User user = new User(userRegisterDto.getName(), userRegisterDto.getEmail(),
                userRegisterDto.getPassword(), userRegisterDto.getPhoneNumber());
        return user;
    }
}
