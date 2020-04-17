package com.example.domain.usecases

import com.example.domain.boundaries.BuyerRepository
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.utility.AddToWishListParam
import com.example.domain.entities.utility.Result

class AddToWishList(
    private val buyerRepository: BuyerRepository
) : UseCase<AddToWishListParam, Boolean> {

    override suspend fun execute(argument: AddToWishListParam): Result<Boolean> {
        val gameId = argument.gameId
        val cart = argument.wishListEntity
        cart.productIdList.add(gameId)
        return try {
            buyerRepository.updateWishList(cart)
            ResultImpl(true, null)
        } catch (throwable: Throwable) {
            ResultImpl(false, throwable)
        }
    }

}