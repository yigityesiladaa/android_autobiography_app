package com.example.biographyapp.models

import android.os.Parcelable
import android.support.v4.app.INotificationSideChannel
import java.io.Serializable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GalleryItem(
    val id : String,
    val title : String,
    val description : String,
    val imageUrl : String,
) : Parcelable
