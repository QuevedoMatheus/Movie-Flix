package com.devsuperior.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dto.UserDTO;
import com.devsuperior.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{profile}")
	public ResponseEntity<UserDTO> findBySelf(){
		UserDTO userDTO = service.findBySelf();
		return ResponseEntity.ok().body(userDTO);
	}
	

}
