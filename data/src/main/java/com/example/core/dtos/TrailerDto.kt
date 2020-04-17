package com.example.core.dtos

import com.example.domain.entities.game.TrailerEntity
import com.google.gson.annotations.SerializedName

class TrailerDto(
    @SerializedName("preview")
    override val preview: String,
    @SerializedName("data")
    override val trailerData: TrailerDataDto
) : TrailerEntity {

    data class TrailerDataDto(
        @SerializedName("480")
        override val url480: String,
        @SerializedName("max")
        override val urlMax: String
    ) : TrailerEntity.TrailerDataEntity
}