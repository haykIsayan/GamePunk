package com.example.features.discover

import androidx.lifecycle.ViewModel
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.game.GameEntity
import com.example.domain.entities.utility.GetRecommendedParam

class DiscoverViewModel(
    private val getFeaturedGames: UseCase<Nothing, List<GameEntity>>,
    private val getRecentGames: UseCase<Nothing, List<GameEntity>>,
    private val getRecommendedGames: UseCase<GetRecommendedParam, List<GameEntity>>
) : ViewModel() {

}