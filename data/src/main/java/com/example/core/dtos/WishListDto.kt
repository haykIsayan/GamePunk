package com.example.core.dtos

import androidx.room.Entity
import com.example.core.Constants
import com.example.domain.entities.buyer.WishListEntity

@Entity(tableName = Constants.WISH_LIST_TABLE)
data class WishListDto(
    override val buyerId: String,
    override val productIdList: MutableList<String>
) : WishListEntity