package com.example.retrofit_compose.di

import com.example.retrofit_compose.api.Apiconstants
import com.example.retrofit_compose.retrofit.Fakerapi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideApi(builder:Retrofit.Builder):Fakerapi{
        return builder
            .build()
            .create(Fakerapi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit():Retrofit.Builder{

        return Retrofit.Builder()
            .baseUrl(Apiconstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())

    }


}