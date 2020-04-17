package com.example.core.dtos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.core.Constants
import com.example.domain.entities.buyer.BuyerEntity

@Entity(tableName = Constants.BUYER_TABLE)
data class BuyerDto(
    @PrimaryKey(autoGenerate = true)
    override val buyerId: Long
) : BuyerEntity