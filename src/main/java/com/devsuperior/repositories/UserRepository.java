package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
