package com.billing.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserLoginDto {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
}
