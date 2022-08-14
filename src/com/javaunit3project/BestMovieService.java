package com.javaunit3project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {

    @Autowired
    private Movie movie;

    public Movie getBestMovie() {
        return movie;
    }
}
