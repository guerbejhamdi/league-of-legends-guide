package com.example.domain.repository

import com.example.common.Resource
import com.example.domain.model.ChampionModel
import kotlinx.coroutines.flow.Flow


interface ChampionRepository {

    suspend fun getAllChampions(): Flow<Resource<List<ChampionModel>>>
}