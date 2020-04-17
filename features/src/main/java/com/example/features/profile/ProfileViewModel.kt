package com.example.features.profile

import androidx.lifecycle.ViewModel
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.buyer.BuyerEntity
import com.example.domain.entities.buyer.WishListEntity

class ProfileViewModel(
    private val getBuyerInfo: UseCase<Long, BuyerEntity>,
    private val getBuyerWishList: UseCase<Long, WishListEntity>
) : ViewModel() {

}