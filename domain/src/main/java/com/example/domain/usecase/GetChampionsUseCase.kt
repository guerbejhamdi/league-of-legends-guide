package com.example.domain.usecase

import com.example.domain.repository.ChampionRepository
import javax.inject.Inject

class GetChampionsUseCase @Inject constructor(
    private val championRepository: ChampionRepository
) {
    suspend operator fun invoke() = championRepository.getAllChampions()
}