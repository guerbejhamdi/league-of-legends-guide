package com.example.data.models.champion_details


import com.example.domain.model.SpellModel
import com.google.gson.annotations.SerializedName

data class Spell(
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("name")
    val name: String,
)

fun Spell.toSpellModel() = SpellModel(
    description = description,
    id = id,
    image = image.toImageModel(),
    name = name
)