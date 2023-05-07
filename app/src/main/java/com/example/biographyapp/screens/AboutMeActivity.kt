package com.example.biographyapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import com.example.biographyapp.models.Person
import com.example.biographyapp.R
import com.example.biographyapp.databinding.ActivityAboutMeBinding
import com.example.biographyapp.interfaces.IBaseService
import com.example.biographyapp.services.PersonService

class AboutMeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAboutMeBinding
    private lateinit var personService: IBaseService<Person>
    private var person: Person? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutMeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        personService = PersonService()

        try {
            person = personService.getDataById("yigit")
            if(person != null){
                binding.txtError.visibility = View.GONE
                binding.txtPersonName.text = "${person!!.firstName} ${person!!.lastName}"
                binding.personAboutWebView.settings.javaScriptEnabled = true
                if(person!!.about != null){
                    binding.personAboutWebView.setBackgroundColor(R.color.webview_background_color)
                    binding.personAboutWebView.loadData(person!!.about!!,"text/html","utf-8")
                }
                Glide.with(this).load(person!!.imageUrl).into(binding.imgPerson)
            }else{
                changeVisibilities()
            }
        }catch (e : Exception){
            Log.d("error",e.toString())
            changeVisibilities()
        }
    }

    private fun changeVisibilities(){
        binding.txtPersonName.visibility = View.GONE
        binding.personAboutWebView.visibility = View.GONE
        binding.imgPerson.visibility = View.GONE
        binding.imageView3.visibility = View.GONE
        binding.txtError.visibility = View.VISIBLE
    }
}