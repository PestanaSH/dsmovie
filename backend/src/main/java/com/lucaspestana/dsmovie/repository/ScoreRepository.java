package com.lucaspestana.dsmovie.repository;

import com.lucaspestana.dsmovie.entities.Score;
import com.lucaspestana.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
