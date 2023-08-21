package com.example.leagueoflegendsguide

import android.app.Application
import com.example.data.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class LOLGuideApplication  : Application(){

    override fun onCreate() {
        super.onCreate()
        //Initialise Timber
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}