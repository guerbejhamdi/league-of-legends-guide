package com.example.leagueoflegendsguide.presentation.champion_list

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.domain.model.ChampionModel
import com.example.leagueoflegendsguide.presentation.champion_list.components.ChampionCardItem
import com.example.leagueoflegendsguide.presentation.ui.theme.LeagueOfLegendsGuideTheme

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
    LazyVerticalGrid(columns = GridCells.Adaptive(128.dp), contentPadding = PaddingValues(8.dp), content =
    {
        items(state.champions.size) { index ->
            ChampionCardItem(champion = state.champions[index])
        }
    })
}


@Preview(name = "ChampionListLight",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
    showBackground = true
)
@Preview(name = "ChampionListDark", uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ChampionListContentPreview() {
    LeagueOfLegendsGuideTheme {
        Surface{
            ChampionListContent(
                state = ChampionListState(
                    champions = List(10) { index ->
                        ChampionModel(
                            id = "id$index",
                            name = "name$index"
                        )
                    }
                )
            )
        }

    }
}

