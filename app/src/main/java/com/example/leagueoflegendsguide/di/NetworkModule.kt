package com.example.leagueoflegendsguide.di

import com.example.common.RequestDebugInterceptor
import com.example.data.BuildConfig
import com.example.data.remote.ChampionApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRequestDebugInterceptor(): RequestDebugInterceptor {
        return RequestDebugInterceptor()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(interceptor: RequestDebugInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
    }


    @Provides
    @Singleton
    fun provideChampionApi(retrofit : Retrofit) : ChampionApi {
        return retrofit.create(ChampionApi::class.java)
    }


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("${BuildConfig.BASE_URL}/${BuildConfig.LOL_VERSION}/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}