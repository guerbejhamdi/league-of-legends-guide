package com.example.leagueoflegendsguide.di

import com.example.data.remote.ChampionApi
import com.example.data.repository.ChampionRepositoryImpl
import com.example.domain.repository.ChampionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideChampionRepository(api : ChampionApi) : ChampionRepository {
        return ChampionRepositoryImpl(api)
    }
}