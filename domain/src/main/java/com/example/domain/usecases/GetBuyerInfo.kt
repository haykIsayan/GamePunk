package com.example.domain.usecases

import com.example.domain.boundaries.BuyerRepository
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.buyer.BuyerEntity
import com.example.domain.entities.utility.Result

class GetBuyerInfo(
    private val buyerRepository: BuyerRepository
) : UseCase<Long, BuyerEntity> {

    override suspend fun execute(argument: Long): Result<BuyerEntity> {
        return try {
            val buyer = buyerRepository.getBuyerInfo(argument)
            ResultImpl(buyer, null)
        } catch (throwable: Throwable) {
            ResultImpl(null, throwable)
        }
    }
}