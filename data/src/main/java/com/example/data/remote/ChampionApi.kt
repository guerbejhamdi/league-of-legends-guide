package com.example.data.remote

import com.example.data.models.ChampionsDataDto
import retrofit2.http.GET

interface ChampionApi {

    @GET("data/en_US/champion.json")
    suspend fun getAllChampions(): ChampionsDataDto

}