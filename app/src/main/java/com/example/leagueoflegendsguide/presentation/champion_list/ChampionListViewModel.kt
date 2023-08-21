package com.example.leagueoflegendsguide.presentation.champion_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.Resource
import com.example.domain.usecase.GetChampionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class ChampionListViewModel @Inject constructor(
    private val getChampionsUseCase: GetChampionsUseCase
) : ViewModel() {


    private val _state = mutableStateOf(ChampionListState())
    val state: State<ChampionListState> = _state

    init{
        getChampions()
    }

    private fun getChampions() {
        viewModelScope.launch {
            getChampionsUseCase().onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        //Log success
                        Timber.tag("ChampionListViewModel").d("Champions Success")
                        //Display number of champions in Logcat
                        Timber.tag("ChampionListViewModel").d("Champions: ${result.data?.size}")
                        //Update the state with the new list of champions
                        _state.value =  ChampionListState(champions = result.data ?: emptyList())
                    }

                    is Resource.Error -> {
                        Timber.tag("ChampionListViewModel").d("Champions Error")
                        //Update the state with the error message
                        _state.value = ChampionListState(error = result.message ?: "An unexpected error occurred")
                    }

                    is Resource.Loading -> {
                        //Log the loading state in Logcat
                        Timber.tag("ChampionListViewModel").d("Loading...")
                        //Update the state with the loading state
                        _state.value = ChampionListState(isLoading = true)
                    }
                }
            }.launchIn(viewModelScope)
        }
    }

}