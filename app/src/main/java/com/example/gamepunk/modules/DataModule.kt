package com.example.gamepunk.modules

import com.example.core.storages.BuyerStorage
import com.example.core.storages.GameStorage
import com.example.domain.boundaries.BuyerRepository
import com.example.domain.boundaries.GameRepository
import org.koin.dsl.module

val dataModule = module {

    single { GameStorage(get()) as GameRepository }

    single { BuyerStorage() as BuyerRepository }

}