package com.devsuperior.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.entities.User;
import com.devsuperior.repositories.UserRepository;
import com.devsuperior.services.exceptions.ForbiddenException;
import com.devsuperior.services.exceptions.UnauthorizedException;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
			
			
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid User");
		}
	}
	
	public void validateSelf(Long id) {
		User user = authenticated();
		
		if (!user.getId().equals(id) && !user.hasRole("ROLE_MEMBER") || !user.hasRole("ROLE_VISITOR")) {
			throw new ForbiddenException("Access denied");
		}
	}

}
