package com.example.domain.usecases

import com.example.domain.boundaries.GameRepository
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.game.GameEntity
import com.example.domain.entities.utility.Result
import com.example.domain.entities.utility.SearchParam

class SearchGames(
    private val gameRepository: GameRepository
) : UseCase<SearchParam, List<GameEntity>> {

    override suspend fun execute(argument: SearchParam): Result<List<GameEntity>> {
        val query = argument.query
        return try {
            val searchResult = gameRepository.getGames(query = query)
            ResultImpl(searchResult, null)
        } catch (throwable: Throwable) {
            ResultImpl(null, throwable)
        }
    }

}