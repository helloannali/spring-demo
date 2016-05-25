package com.dollar.annotation;

import com.dollar.annotation.service.MovieFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Author why
 * Date 16-5-25
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
@Service
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Autowired
    public SimpleMovieLister(@Qualifier("china") MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
        System.out.println("-------------" + movieFinder.getClass() + "-------------");
    }
}
