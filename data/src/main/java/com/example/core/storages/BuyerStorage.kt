package com.example.core.storages

import com.example.domain.boundaries.BuyerRepository
import com.example.domain.entities.buyer.BuyerEntity
import com.example.domain.entities.buyer.WishListEntity

class BuyerStorage : BuyerRepository {

    override fun updateWishList(wishListEntity: WishListEntity) {

    }

    override fun getWishList(userId: Long): WishListEntity? {
        return null
    }

    override fun getBuyerInfo(userId: Long): BuyerEntity? {
        return null
    }

}