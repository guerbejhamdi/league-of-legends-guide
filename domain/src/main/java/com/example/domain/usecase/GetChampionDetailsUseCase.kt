package com.example.domain.usecase

import com.example.domain.repository.ChampionRepository
import javax.inject.Inject

class GetChampionDetailsUseCase @Inject constructor(
    private val championRepository: ChampionRepository
) {

    suspend operator fun invoke(championId: String) =
        championRepository.getChampionDetails(championId)

}