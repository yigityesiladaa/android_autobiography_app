package com.example.biographyapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biographyapp.adapters.CustomGalleryAdapter
import com.example.biographyapp.databinding.ActivityGalleryBinding
import com.example.biographyapp.models.GalleryItem
import com.example.biographyapp.services.GalleryService

class GalleryActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGalleryBinding
    private lateinit var customGalleryAdapter: CustomGalleryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        GalleryService().fillGalleryItems()
        var galleryItems = GalleryService.galleryItems

        customGalleryAdapter = if(galleryItems != null){
            CustomGalleryAdapter(this,galleryItems)
        }else{
            CustomGalleryAdapter(this, listOf<GalleryItem>())
        }

        binding.galleryListView.adapter = customGalleryAdapter
    }
}