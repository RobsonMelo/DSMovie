package com.robson.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robson.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
