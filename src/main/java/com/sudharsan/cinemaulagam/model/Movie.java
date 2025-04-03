package com.sudharsan.cinemaulagam.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movies")

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 255)
    private String genre;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(nullable = false, length = 50) // Changed from Enum to String
    private String category;

    @Column(length = 50, nullable = false)
    private String formats;

    @Column(length = 20, nullable = false)
    private String duration;

    @Column(length = 50, nullable = false)
    private String language;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date releaseDate;

    private String trailerLink;

    @Column(nullable = false)
    private String imageUrl;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date createdAt;

    // Default Constructor
    public Movie() {
        this.createdAt = new Date();
    }

    // Parameterized Constructor
    public Movie(String title, String genre, String description, String category,
                 String formats, String duration, String language, Date releaseDate,
                 String trailerLink, String imageUrl) {
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.category = category;
        this.formats = formats;
        this.duration = duration;
        this.language = language;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.imageUrl = imageUrl;
        this.createdAt = new Date();
    }

    // Getters and Setters
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFormats() {
        return formats;
    }

    public void setFormats(String formats) {
        this.formats = formats;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

}
