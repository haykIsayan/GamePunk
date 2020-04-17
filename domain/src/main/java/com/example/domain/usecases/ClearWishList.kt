package com.example.domain.usecases

import com.example.domain.boundaries.BuyerRepository
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.buyer.WishListEntity
import com.example.domain.entities.utility.Result

class ClearWishList(
    private val buyerRepository: BuyerRepository
) : UseCase<WishListEntity, Boolean> {

    override suspend fun execute(argument: WishListEntity): Result<Boolean> {
        argument.productIdList.clear()
        buyerRepository.updateWishList(argument)
        return try {
            buyerRepository.updateWishList(argument)
            ResultImpl(true, null)
        } catch (throwable: Throwable) {
            ResultImpl(false, throwable)
        }
    }

}