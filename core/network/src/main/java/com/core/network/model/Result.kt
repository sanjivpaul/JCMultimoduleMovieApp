package com.core.network.model

data class Result(
    val _id: String,
    val id: Int,
    val overview: String,
    val popularity: Int,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_average: Double,
    val vote_count: Int
)