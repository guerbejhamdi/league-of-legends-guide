package com.example.data.models

import com.example.domain.model.ChampionModel
import com.google.gson.annotations.SerializedName

data class Champion(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)

fun Champion.toChampion() = ChampionModel(
    id = id,
    name = name
)
