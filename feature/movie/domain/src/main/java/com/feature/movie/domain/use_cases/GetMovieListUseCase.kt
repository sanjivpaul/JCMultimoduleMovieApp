package com.feature.movie.domain.use_cases

import com.core.common.UiEvent
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repo.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetMovieListUseCase @Inject constructor(private val movieRepository: MovieRepository) {
    operator fun invoke(token: String, page:Int) = flow<UiEvent<List<Movie>>> {

        emit(UiEvent.Loading())

        emit(UiEvent.Success(movieRepository.getMovieList(token, page)))
    }.catch {
        emit(UiEvent.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)
}