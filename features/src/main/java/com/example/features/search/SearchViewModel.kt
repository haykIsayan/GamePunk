package com.example.features.search

import androidx.lifecycle.ViewModel
import com.example.domain.boundaries.UseCase
import com.example.domain.entities.game.GameEntity
import com.example.domain.entities.utility.SearchParam

class SearchViewModel(
    private val searchGames: UseCase<SearchParam, List<GameEntity>>
) : ViewModel() {

}