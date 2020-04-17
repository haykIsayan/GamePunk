package com.example.gamepunk.modules

import com.example.domain.usecases.*
import com.example.features.discover.DiscoverViewModel
import com.example.features.profile.ProfileViewModel
import com.example.features.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val searchModule = module {
    viewModel {
        SearchViewModel(
            searchGames = SearchGames(get())
        )
    }
}

val discoverModule = module {
    viewModel {
        DiscoverViewModel(
            getFeaturedGames = GetTrendingGames(get()),
            getRecommendedGames = GetRecommendedGames(get(), get()),
            getRecentGames = GetRecentGames("sdf", get())
        )
    }
}

val profileModule = module {
    viewModel {
        ProfileViewModel(
            getBuyerWishList = GetBuyerWishList(get()),
            getBuyerInfo = GetBuyerInfo(get())
        )
    }
}