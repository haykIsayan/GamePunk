package com.example.domain.boundaries

import com.example.domain.entities.game.GameEntity

interface GameRepository {
    suspend fun getGames(
        query: String = "",
        releaseInterval:String = ""
    ): List<GameEntity>

    suspend fun getGameDetails(gameId: String): GameEntity

    suspend fun getSimilarGames(gameId: String): List<GameEntity>
}