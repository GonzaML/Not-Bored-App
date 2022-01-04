package com.example.notbored.retroFit

import com.google.gson.annotations.SerializedName

data class NotBoredResponse(
    @SerializedName("activity") val activity: String,
    @SerializedName("participants") val participants: Int,
    @SerializedName("price") val price: Double,
    @SerializedName("type") val type: String
    )