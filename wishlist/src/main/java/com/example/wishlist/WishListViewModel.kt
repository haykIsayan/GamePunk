package com.example.wishlist

import androidx.lifecycle.ViewModel
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.buyer.WishListEntity

class WishListViewModel(
    private val getWishList: UseCase<Long, WishListEntity>
) : ViewModel() {

}
