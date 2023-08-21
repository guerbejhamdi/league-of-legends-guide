package com.example.data.models.champion_details


import com.example.domain.model.ImageModel
import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("full")
    val full: String,
    @SerializedName("group")
    val group: String,
    @SerializedName("h")
    val h: Int,
    @SerializedName("sprite")
    val sprite: String,
    @SerializedName("w")
    val w: Int,
    @SerializedName("x")
    val x: Int,
    @SerializedName("y")
    val y: Int
)

fun Image.toImageModel() = ImageModel(
    full = full,
    group = group,
    h = h,
    sprite = sprite,
    w = w,
    x = x,
    y = y
)