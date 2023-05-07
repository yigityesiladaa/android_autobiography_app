package com.example.biographyapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val id : String,
    val firstName : String,
    val lastName : String,
    var age : Int,
    val about : String?,
    var imageUrl : String?,
    val contacts : Contact
) : Parcelable
