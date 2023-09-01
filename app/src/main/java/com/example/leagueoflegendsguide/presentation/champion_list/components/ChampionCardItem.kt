package com.example.leagueoflegendsguide.presentation.champion_list.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.domain.model.ChampionModel
import com.example.domain.model.getChampionImageUrl
import com.example.leagueoflegendsguide.R
import com.example.leagueoflegendsguide.presentation.ui.theme.LeagueOfLegendsGuideTheme
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun ChampionCardItem(champion: ChampionModel) {

    ElevatedCard(modifier = Modifier.padding(8.dp)) {
        Column {
            GlideImage(
                modifier = Modifier
                    .width(width = 250.dp)
                    .clip(shape = RoundedCornerShape(size = 12.dp)),
                imageModel = {champion.getChampionImageUrl()},
                previewPlaceholder = R.drawable.ic_launcher_background,
            )
            Text(
                modifier = Modifier
                    .padding(12.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                text = champion.name,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview(name = "ChampionCILight",uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Composable
fun ChampionCardItemPreview() {
    LeagueOfLegendsGuideTheme {
        ChampionCardItem(champion = ChampionModel("Aatrox", "ChampName"))
    }
}

@Preview(name="ChampionCIDark",uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ChampionCardItemPreviewDark() {
    LeagueOfLegendsGuideTheme(darkTheme = true) {
        ChampionCardItem(champion = ChampionModel("Aatrox", "ChampName"))
    }
}

