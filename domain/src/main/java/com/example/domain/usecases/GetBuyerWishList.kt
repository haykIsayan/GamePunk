package com.example.domain.usecases

import com.example.domain.boundaries.BuyerRepository
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.buyer.WishListEntity
import com.example.domain.entities.utility.Result

class GetBuyerWishList(
    private val buyerRepository: BuyerRepository
) : UseCase<Long, WishListEntity> {

    override suspend fun execute(argument: Long): Result<WishListEntity> {
        return try {
            val wishList = buyerRepository.getWishList(argument)
            ResultImpl(wishList, null)
        } catch (throwable: Throwable) {
            ResultImpl(null, throwable)
        }

    }
}