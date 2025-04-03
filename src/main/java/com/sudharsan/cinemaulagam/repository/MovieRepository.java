package com.sudharsan.cinemaulagam.repository;

import com.sudharsan.cinemaulagam.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
