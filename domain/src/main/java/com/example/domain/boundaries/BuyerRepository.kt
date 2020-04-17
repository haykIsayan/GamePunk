package com.example.domain.boundaries

import com.example.domain.entities.buyer.BuyerEntity
import com.example.domain.entities.buyer.WishListEntity

interface BuyerRepository {
    fun updateWishList(wishListEntity: WishListEntity)

    fun getWishList(userId: Long): WishListEntity?

    fun getBuyerInfo(userId: Long): BuyerEntity?
}