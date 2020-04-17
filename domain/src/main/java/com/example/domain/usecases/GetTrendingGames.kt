package com.example.domain.usecases

import com.example.domain.boundaries.GameRepository
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.game.GameEntity
import com.example.domain.entities.utility.Result

class GetTrendingGames(
    private val gameRepository: GameRepository
) : UseCase<Nothing, List<GameEntity>> {

    override suspend fun execute(argument: Nothing): Result<List<GameEntity>> {
        return try {
            val trendingGames = gameRepository.getGames()
            ResultImpl(trendingGames, null)
        } catch (throwable: Throwable) {
            ResultImpl(null, throwable)
        }
    }

}