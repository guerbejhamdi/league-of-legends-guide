package com.example.leagueoflegendsguide.presentation.champion_list

import com.example.domain.model.ChampionModel

data class ChampionListState (
    val isLoading: Boolean = false,
    val champions: List<ChampionModel> = emptyList(),
    val error: String = ""
)