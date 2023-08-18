package com.example.data.models

import com.google.gson.annotations.SerializedName

data class ChampionsDataDto(
    @SerializedName("data")
    val data: Map<String, Champion>
)


fun ChampionsDataDto.toChampions() = data.map { it.value.toChampion() }