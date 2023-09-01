package com.example.data.models.champion_details


import com.example.domain.model.InfoModel
import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("attack")
    val attack: Int,
    @SerializedName("defense")
    val defense: Int,
    @SerializedName("difficulty")
    val difficulty: Int,
    @SerializedName("magic")
    val magic: Int
)

fun Info.toInfoModel() = InfoModel(
    attack = attack,
    defense = defense,
    difficulty = difficulty,
    magic = magic
)