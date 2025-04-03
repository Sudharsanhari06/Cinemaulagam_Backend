package com.sudharsan.cinemaulagam.service;


import com.sudharsan.cinemaulagam.model.Movie;
import com.sudharsan.cinemaulagam.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movierepository) {
        this.movieRepository = movierepository;
    }

    public static Movie updateMovie(Long id, Movie movie) {
        return null;
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovie(){
        return movieRepository.findAll();
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }
}