package kr.ac.kumoh.s20160250.imagesearch.data.models


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("city")
    val city: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("position")
    val position: Position?
)