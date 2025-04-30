package com.feature.movie.domain.repo

import com.feature.movie.domain.model.Movie

interface MovieRepository {
    suspend fun getMovieList(token:String, page:Int): List<Movie>
}