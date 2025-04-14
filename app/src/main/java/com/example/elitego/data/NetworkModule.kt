package com.example.elitego.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://10.0.0.2:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    @Provides
    fun provideCustomerApi(retrofit: Retrofit): CustomerApi {

        return retrofit.create(
            CustomerApi::
            class.java
        )
    }
}