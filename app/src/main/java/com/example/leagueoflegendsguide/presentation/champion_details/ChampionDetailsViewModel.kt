package com.example.leagueoflegendsguide.presentation.champion_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.Resource
import com.example.domain.usecase.GetChampionDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class ChampionDetailsViewModel @Inject constructor(
    private val getChampionDetailsUseCase: GetChampionDetailsUseCase
) : ViewModel() {

    init {
        getChampionDetails()
    }

    private fun getChampionDetails() {
        viewModelScope.launch {
            getChampionDetailsUseCase("Aatrox").onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        //Log success
                        Timber.tag("ChampionDetailsViewModel").d("Champion Details Success")
                    }

                    is Resource.Error -> {
                        Timber.tag("ChampionDetailsViewModel").d("Champion Details Error")

                    }

                    is Resource.Loading -> {
                        //Log the loading state in Logcat
                        Timber.tag("ChampionDetailsViewModel").d("Loading...")
                    }
                }
            }.launchIn(viewModelScope)
        }
    }
}