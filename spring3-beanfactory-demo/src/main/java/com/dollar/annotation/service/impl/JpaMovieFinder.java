package com.dollar.annotation.service.impl;

import com.dollar.annotation.service.MovieFinder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Author why
 * Date 16-5-25
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
@Repository
@Qualifier("jpa")
public class JpaMovieFinder implements MovieFinder {
}
