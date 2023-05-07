package com.example.biographyapp.adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListView
import com.bumptech.glide.Glide
import android.widget.TextView
import com.example.biographyapp.R
import com.example.biographyapp.models.GalleryItem
import com.example.biographyapp.screens.GalleryItemDetailActivity

class CustomGalleryAdapter(private val context: Activity, private val list: List<GalleryItem>) : ArrayAdapter<GalleryItem>(context,
    R.layout.gallery_list_item,list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = LayoutInflater.from(context).inflate(R.layout.gallery_list_item,null,true)

        val linearLayout = rootView.findViewById<LinearLayout>(R.id.linearLayout)
        val galleryItemTitle = rootView.findViewById<TextView>(R.id.txtTitle)
        val galleryItemImage = rootView.findViewById<ImageView>(R.id.galleryItemImageView)
        val txtNotFound = context.findViewById<TextView>(R.id.txtNotFound)
        val galleryListView = context.findViewById<ListView>(R.id.galleryListView)

        if(list.isNotEmpty()){
            txtNotFound.visibility = View.GONE
            galleryListView.visibility = View.VISIBLE
            val galleryItem = list[position]
            galleryItemTitle.text = galleryItem.title
            Glide.with(rootView).load(galleryItem.imageUrl).into(galleryItemImage)

            linearLayout.setOnClickListener {
                val intent = Intent(context, GalleryItemDetailActivity::class.java)
                intent.putExtra("GalleryItem",galleryItem)
                context.startActivity(intent)
            }
        }else{
            txtNotFound.visibility = View.VISIBLE
            galleryListView.visibility = View.GONE
        }

        return rootView
    }
}