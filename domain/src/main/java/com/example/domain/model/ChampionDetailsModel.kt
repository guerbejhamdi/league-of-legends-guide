package com.example.domain.model


data class ChampionDetailsModel(
    val enemytips: List<String>,
    val id: String,
    val image: ImageModel,
    val info: InfoModel,
    val key: String,
    val lore: String,
    val name: String,
    val passive: PassiveModel,
    val recommended: List<Any>,
    val skins: List<SkinModel>,
    val spells: List<SpellModel>,
    val stats: StatsModel,
    val tags: List<String>,
    val title: String
)

