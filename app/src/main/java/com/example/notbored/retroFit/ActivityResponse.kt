package com.example.notbored.retroFit

import com.google.gson.annotations.SerializedName

data class ActivityResponse(

    @SerializedName(value = "activity")
    val activity: String,

    @SerializedName(value = "type")
    val type: String,

    @SerializedName(value = "participants")
    val participants: Int,

    @SerializedName(value = "price")
    val price: Double,

)

/*"activity": "Learn how to play a new sport",
"accessibility": 0.2,
"type": "recreational",
"participants": 1,
"price": 0.1,
"key": "5808228"*/
