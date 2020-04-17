package com.example.domain.entities.utility

import com.example.domain.entities.buyer.WishListEntity

interface AddToWishListParam {
    val gameId: String
    val wishListEntity: WishListEntity
}