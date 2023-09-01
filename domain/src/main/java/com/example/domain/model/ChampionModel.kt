package com.example.domain.model

data class ChampionModel(
    val id: String,
    val name: String,
    )

fun ChampionModel.getChampionImageUrl() : String {
    return "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/${this.id}_0.jpg"
}
