package com.lucaspestana.dsmovie.dto;

public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double scoure;

    public ScoreDTO() {

    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScoure() {
        return scoure;
    }

    public void setScoure(Double scoure) {
        this.scoure = scoure;
    }
}
