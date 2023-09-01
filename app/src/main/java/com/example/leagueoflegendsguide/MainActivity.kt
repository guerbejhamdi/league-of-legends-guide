package com.example.leagueoflegendsguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.leagueoflegendsguide.presentation.champion_list.ChampionListScreen
import com.example.leagueoflegendsguide.presentation.ui.theme.LeagueOfLegendsGuideTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeagueOfLegendsGuideTheme {
             ChampionListScreen()
            }
        }
    }
}

