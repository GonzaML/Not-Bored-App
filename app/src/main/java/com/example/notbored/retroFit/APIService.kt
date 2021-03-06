package com.example.notbored.retroFit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getSuggestion(@Url url:String): Response<NotBoredResponse>
}