package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
