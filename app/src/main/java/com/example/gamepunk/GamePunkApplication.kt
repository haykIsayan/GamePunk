package com.example.gamepunk

import android.app.Application
import com.example.gamepunk.modules.dataModule
import com.example.gamepunk.modules.discoverModule
import com.example.gamepunk.modules.profileModule
import com.example.gamepunk.modules.searchModule
import org.koin.core.context.startKoin

class GamePunkApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                listOf(
                    discoverModule,
                    profileModule,
                    searchModule,
                    dataModule
                )
            )
        }

    }
}