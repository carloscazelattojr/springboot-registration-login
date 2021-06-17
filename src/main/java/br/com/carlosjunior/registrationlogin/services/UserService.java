package br.com.carlosjunior.registrationlogin.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.carlosjunior.registrationlogin.entities.User;
import br.com.carlosjunior.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
}
