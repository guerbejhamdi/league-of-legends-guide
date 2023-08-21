package com.example.data.models.champion_details


import com.example.domain.model.StatsModel
import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("armor")
    val armor: Int,
    @SerializedName("armorperlevel")
    val armorperlevel: Double,
    @SerializedName("attackdamage")
    val attackdamage: Int,
    @SerializedName("attackdamageperlevel")
    val attackdamageperlevel: Int,
    @SerializedName("attackrange")
    val attackrange: Int,
    @SerializedName("attackspeed")
    val attackspeed: Double,
    @SerializedName("attackspeedperlevel")
    val attackspeedperlevel: Double,
    @SerializedName("crit")
    val crit: Int,
    @SerializedName("critperlevel")
    val critperlevel: Int,
    @SerializedName("hp")
    val hp: Int,
    @SerializedName("hpperlevel")
    val hpperlevel: Int,
    @SerializedName("hpregen")
    val hpregen: Int,
    @SerializedName("hpregenperlevel")
    val hpregenperlevel: Int,
    @SerializedName("movespeed")
    val movespeed: Int,
    @SerializedName("mp")
    val mp: Int,
    @SerializedName("mpperlevel")
    val mpperlevel: Int,
    @SerializedName("mpregen")
    val mpregen: Int,
    @SerializedName("mpregenperlevel")
    val mpregenperlevel: Int,
    @SerializedName("spellblock")
    val spellblock: Int,
    @SerializedName("spellblockperlevel")
    val spellblockperlevel: Double
)


fun Stats.toStatsModel() = StatsModel(
    armor = armor,
    armorperlevel = armorperlevel,
    attackdamage = attackdamage,
    attackdamageperlevel = attackdamageperlevel,
    attackrange = attackrange,
    attackspeed = attackspeed,
    attackspeedperlevel = attackspeedperlevel,
    crit = crit,
    critperlevel = critperlevel,
    hp = hp,
    hpperlevel = hpperlevel,
    hpregen = hpregen,
    hpregenperlevel = hpregenperlevel,
    movespeed = movespeed,
    mp = mp,
    mpperlevel = mpperlevel,
    mpregen = mpregen,
    mpregenperlevel = mpregenperlevel,
    spellblock = spellblock,
    spellblockperlevel = spellblockperlevel
)
