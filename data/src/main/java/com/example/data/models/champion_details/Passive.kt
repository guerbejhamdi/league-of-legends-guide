package com.example.data.models.champion_details


import com.example.domain.model.PassiveModel
import com.google.gson.annotations.SerializedName

data class Passive(
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("name")
    val name: String
)

fun Passive.toPassiveModel() = PassiveModel(
    description = description,
    image = image.toImageModel(),
    name = name
)