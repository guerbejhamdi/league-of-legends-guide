package com.example.data.remote

import com.example.data.models.champion_details.ChampionDetailsDto
import com.example.data.models.champion_details.ChampionDetailsResponse
import com.example.data.models.ChampionsDataDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ChampionApi {

    @GET("data/en_US/champion.json")
    suspend fun getAllChampions(): ChampionsDataDto

    @GET("data/en_US/champion/{id}.json")
    suspend fun getChampionDetailsById(@Path("id") id: String): ChampionDetailsResponse<ChampionDetailsDto>


}