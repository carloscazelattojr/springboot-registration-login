package br.com.carlosjunior.registrationlogin.services;

import java.util.Arrays;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.carlosjunior.registrationlogin.entities.Role;
import br.com.carlosjunior.registrationlogin.entities.User;
import br.com.carlosjunior.registrationlogin.repositories.UserRepository;
import br.com.carlosjunior.registrationlogin.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User( 	registrationDto.getFirstName(), 
								registrationDto.getLastName(),
								registrationDto.getEmail(), 
								registrationDto.getPassword(),
								Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
