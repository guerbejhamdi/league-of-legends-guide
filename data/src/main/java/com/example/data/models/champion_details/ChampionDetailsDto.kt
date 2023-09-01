package com.example.data.models.champion_details


import com.example.domain.model.ChampionDetailsModel
import com.google.gson.annotations.SerializedName

data class ChampionDetailsDto(

    @SerializedName("enemytips")
    val enemytips: List<String>,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: Image,
    @SerializedName("info")
    val info: Info,
    @SerializedName("key")
    val key: String,
    @SerializedName("lore")
    val lore: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("passive")
    val passive: Passive,
    @SerializedName("recommended")
    val recommended: List<Any>,
    @SerializedName("skins")
    val skins: List<Skin>,
    @SerializedName("stats")
    val stats: Stats,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("title")
    val title: String,
    @SerializedName("spells")
    val spells: List<Spell>
)

fun ChampionDetailsDto.toChampionDetailsModel(): ChampionDetailsModel {
    return ChampionDetailsModel(
        enemytips = enemytips,
        id = id,
        image = image.toImageModel(),
        info = info.toInfoModel(),
        key = key,
        lore = lore,
        name = name,
        passive = passive.toPassiveModel(),
        recommended = recommended,
        skins = skins.map { it.toSkinModel() },
        stats = stats.toStatsModel(),
        tags = tags,
        title = title,
        spells = spells.map { it.toSpellModel() }
    )
}