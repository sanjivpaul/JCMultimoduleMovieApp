package com.core.network

import com.core.network.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {

    //https://mytaskapp-iota.vercel.app/api/movie/popular?page=2

    @GET("api/movie/popular")
    suspend fun getMovieList(
        @Header("Authorization") token: String,
        @Query("page") page: Int
    ): MovieListResponse
}