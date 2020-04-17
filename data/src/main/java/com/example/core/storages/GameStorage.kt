package com.example.core.storages

import com.example.core.dtos.GameDto
import com.example.core.services.GameService
import com.example.domain.boundaries.GameRepository
import com.example.domain.entities.game.GameEntity

class GameStorage(
    private val gameService: GameService
) : GameRepository {

    override suspend fun getGames(query: String, releaseInterval: String): List<GameEntity> {
        return gameService.getGames() ?: emptyList()
    }

    override suspend fun getGameDetails(gameId: String): GameDto {
        return gameService.getGameDetails(gameId)
    }

    override suspend fun getSimilarGames(gameId: String): List<GameEntity> {
        return emptyList()
    }
}