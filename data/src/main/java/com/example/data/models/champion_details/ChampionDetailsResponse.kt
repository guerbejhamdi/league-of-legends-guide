package com.example.data.models.champion_details


import com.google.gson.annotations.SerializedName

data class ChampionDetailsResponse<T>(
    @SerializedName("data")
    val `data`:  Map<String, T>,
)