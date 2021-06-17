package br.com.carlosjunior.registrationlogin.services;

import br.com.carlosjunior.registrationlogin.entities.User;
import br.com.carlosjunior.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto);
	
}
