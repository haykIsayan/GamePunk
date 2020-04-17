package com.example.core.services

import com.example.core.dtos.GameDto
import retrofit2.http.GET
import retrofit2.http.Path

interface GameService {

    @GET("/games")
    suspend fun getGames(): List<GameDto>?

    @GET("/games/{gameId}")
    suspend fun getGameDetails(@Path("gameId") gameId: String): GameDto
}