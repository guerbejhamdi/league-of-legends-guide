package com.example.leagueoflegendsguide.presentation.champion_list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ChampionListScreen(
    viewModel: ChampionListViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    Box(modifier = Modifier.fillMaxSize()) {
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }

    ChampionListContent(state = state)
}

@Composable
fun ChampionListContent(state: ChampionListState) {
    //display number of champions in text composable
    Text(text = "Champions: ${state.champions.size}")
}

