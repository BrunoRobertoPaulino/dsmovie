package com.movie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.dsmovie.entities.Score;
import com.movie.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
