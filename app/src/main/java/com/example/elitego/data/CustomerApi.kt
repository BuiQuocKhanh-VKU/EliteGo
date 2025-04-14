package com.example.elitego.data

import retrofit2.http.GET

interface CustomerApi {
    @GET("/user")
    suspend fun getUser(): List<String>
}