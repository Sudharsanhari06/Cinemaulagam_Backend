package com.sudharsan.cinemaulagam.controller;

import com.sudharsan.cinemaulagam.model.Movie;
import com.sudharsan.cinemaulagam.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/movie")
public class MovieController {

    //call the service. to create the object
     private final MovieService movieService;
        public MovieController(MovieService movieService) {
            this.movieService = movieService;
        }
        
    // Add a New Movie
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

        // Get All Todos
        @GetMapping
        public List<Movie> getAllmovies() {
            return movieService.getAllMovie();
        }

        // Get movie by ID
        @GetMapping("/{id}")
        public ResponseEntity<Movie> getTodoById(@PathVariable int id) {
            Movie movie = movieService.getMovieById(id);
            return movie != null ? ResponseEntity.ok(movie) : ResponseEntity.notFound().build();
        }

//        // Update Todo
        @PutMapping("/{id}")
        public ResponseEntity<Movie> updateTodo(@PathVariable Long id, @RequestBody Movie movie) {
            Movie updatedMovie = MovieService.updateMovie(id,movie);
            return updatedMovie != null ? ResponseEntity.ok(updatedMovie) : ResponseEntity.notFound().build();
        }



        // Delete Todo
        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteMovie(@PathVariable int id) {
            movieService.deleteMovie(id);
            return ResponseEntity.ok("movie deleted successfully!");
        }


    }


