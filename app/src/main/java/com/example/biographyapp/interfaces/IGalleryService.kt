package com.example.biographyapp.interfaces

import com.example.biographyapp.models.GalleryItem

interface IGalleryService : IBaseService<GalleryItem>{

    override fun getDataById(id : String) : GalleryItem?
    override fun getDataList() : List<GalleryItem>
}