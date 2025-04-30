package com.core.network.dataproviders

import com.core.network.ApiService
import javax.inject.Inject

class MovieDataProvider @Inject constructor(private val apiService: ApiService) {

    suspend fun getMovieList(token:String, page:Int)= apiService.getMovieList(token, page)
}