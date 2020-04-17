package com.example.domain.usecases

import com.example.domain.boundaries.BuyerRepository
import com.example.domain.boundaries.GameRepository
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.game.GameEntity
import com.example.domain.entities.utility.GetRecommendedParam
import com.example.domain.entities.utility.Result
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll

class GetRecommendedGames(
    private val buyerRepository: BuyerRepository,
    private val gameRepository: GameRepository
) : UseCase<GetRecommendedParam, List<GameEntity>> {

    override suspend fun execute(argument: GetRecommendedParam): Result<List<GameEntity>> {
        return try {
            val wishList = buyerRepository.getWishList(argument.userId)
            val recommendedAvailable = wishList?.productIdList?.isNotEmpty() ?: false
            val recommendedGames = if (recommendedAvailable) {
                wishList?.productIdList?.map { gameId ->
                    argument.scope.async { gameRepository.getSimilarGames(gameId) }
                }?.awaitAll()?.flatten()?.shuffled() ?: emptyList()
            } else {
                emptyList()
            }
            ResultImpl(recommendedGames, null)
        } catch (throwable: Throwable) {
            ResultImpl(null, throwable)
        }

    }
}