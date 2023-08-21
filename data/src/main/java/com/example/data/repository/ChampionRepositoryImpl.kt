package com.example.data.repository

import android.util.Log
import com.example.common.Resource
import com.example.data.models.toChampion
import com.example.data.remote.ChampionApi
import com.example.domain.model.ChampionModel
import com.example.domain.repository.ChampionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ChampionRepositoryImpl @Inject constructor(
    private val championApi: ChampionApi
) : ChampionRepository {

    override suspend fun getAllChampions(): Flow<Resource<List<ChampionModel>>> = flow {
        emit(Resource.Loading())
        try {
            val championsData = championApi.getAllChampions()
            val champions = championsData.data.map { it.value.toChampion() }
            Log.d("ChampionRepositoryImpl", "getAllChampions: $champions")
            emit(Resource.Success(champions))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }

}