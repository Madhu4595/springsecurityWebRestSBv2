package com.app.tutus.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.app.tutus.dto.UserRegistrationDto;
import com.app.tutus.entity.AppUser;

public interface UserService extends UserDetailsService{
	
	AppUser save(UserRegistrationDto userRegistrationDto);

}
