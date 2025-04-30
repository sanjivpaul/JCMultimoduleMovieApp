package com.feature.movie.data.repo

import com.core.network.dataproviders.MovieDataProvider
import com.feature.movie.data.mapper.toDomainMovieList
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repo.MovieRepository
import javax.inject.Inject

class MovieRepoImpl @Inject constructor(private val moviewDataProvider: MovieDataProvider) :MovieRepository {

    override suspend fun getMovieList(token: String, page: Int): List<Movie> {
        return moviewDataProvider.getMovieList(token, page).toDomainMovieList()
    }

}