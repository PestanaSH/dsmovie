package com.lucaspestana.dsmovie.repository;

import com.lucaspestana.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
