package com.example.domain.entities.buyer

interface WishListEntity {
    val buyerId: String
    val productIdList: MutableList<String>
}