package com.robson.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robson.dsmovie.entities.Score;
import com.robson.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
