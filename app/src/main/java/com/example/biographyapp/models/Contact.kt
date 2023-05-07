package com.example.biographyapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val email : String,
    val phone : String,
    val address : String,
) : Parcelable
