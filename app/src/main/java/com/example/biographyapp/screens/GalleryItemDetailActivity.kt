package com.example.biographyapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.biographyapp.databinding.ActivityGalleryItemDetailBinding
import com.example.biographyapp.models.GalleryItem

class GalleryItemDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityGalleryItemDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryItemDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val galleryItem = intent.getParcelableExtra<GalleryItem>("GalleryItem")

        if(galleryItem != null){
            binding.txtGalleryItemTitle.text = galleryItem.title
            binding.txtGalleryItemDescription.text = galleryItem.description
            Glide.with(this).load(galleryItem.imageUrl).into(binding.imgGalleryItem)
        }
    }
}