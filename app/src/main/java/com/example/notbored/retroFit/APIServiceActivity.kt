package com.example.notbored.retroFit

import retrofit2.http.GET
import retrofit2.Response
import retrofit2.http.Url

interface APIServiceActivity {

    @GET
    suspend fun getActivity(@Url url: String): Response<ActivityResponse>

    @GET
    suspend fun getActivityByType(@Url url: String):Response<ActivityResponse>


}