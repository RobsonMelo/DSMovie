package com.robson.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robson.dsmovie.dto.MovieDTO;
import com.robson.dsmovie.entities.Movie;
import com.robson.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		Page<Movie> pageMovie = repository.findAll(pageable);
		Page<MovieDTO> pageRetorno = pageMovie.map(m -> new MovieDTO(m));
		return pageRetorno;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie movie = repository.findById(id).get();
		MovieDTO retorno =new MovieDTO(movie);
		return retorno;
	}
}
