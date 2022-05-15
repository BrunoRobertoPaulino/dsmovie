package com.movie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
