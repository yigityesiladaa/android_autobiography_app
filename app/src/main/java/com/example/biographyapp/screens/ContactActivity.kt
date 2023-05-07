package com.example.biographyapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.biographyapp.databinding.ActivityContactBinding
import com.example.biographyapp.services.PersonService

class ContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactBinding
    private lateinit var personService: PersonService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        personService = PersonService()
        try {
            val person = personService.getDataById("yigit")

            if(person != null){
                binding.txtMail.text = person.contacts.email
                binding.txtPhone.text = person.contacts.phone
                binding.txtAddress.text = person.contacts.address
            }else{
                binding.txtMail.text = "UnKnown"
                binding.txtPhone.text = "UnKnown"
                binding.txtAddress.text = "UnKnown"
            }
        }catch (e: Exception){
            binding.txtMail.text = "UnKnown"
            binding.txtPhone.text = "UnKnown"
            binding.txtAddress.text = "UnKnown"
            Log.d("exception",e.toString())
        }
    }
}