package com.example.data.models.champion_details


import com.example.domain.model.SkinModel
import com.google.gson.annotations.SerializedName

data class Skin(
    @SerializedName("chromas")
    val chromas: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("num")
    val num: Int
)

fun Skin.toSkinModel() = SkinModel(
    chromas = chromas,
    id = id,
    name = name,
    num = num
)