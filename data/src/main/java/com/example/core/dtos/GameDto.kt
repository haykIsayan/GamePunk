package com.example.core.dtos

import com.example.domain.entities.game.GameEntity
import com.google.gson.annotations.SerializedName

data class GameDto(
    @SerializedName("name")
    override val title: String,
    @SerializedName("backgroundImage")
    override val cover: String,
    @SerializedName("description")
    override val description: String,
    @SerializedName("released")
    override val released: String
) : GameEntity