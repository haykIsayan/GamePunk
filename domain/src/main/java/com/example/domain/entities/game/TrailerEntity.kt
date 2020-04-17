package com.example.domain.entities.game

interface TrailerEntity {
    val preview: String
    val trailerData: TrailerDataEntity

    interface TrailerDataEntity {
        val url480: String
        val urlMax: String
    }

}