package net.javaguides.springbootregistrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springbootregistrationlogin.model.User;
import net.javaguides.springbootregistrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
