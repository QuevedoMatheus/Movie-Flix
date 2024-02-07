package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
