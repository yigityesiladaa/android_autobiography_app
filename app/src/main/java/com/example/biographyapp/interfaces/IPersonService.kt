package com.example.odev_3.interfaces

import com.example.biographyapp.interfaces.IBaseService
import com.example.biographyapp.models.Person

interface IPersonService : IBaseService<Person>{

    override fun getDataById(id : String) : Person?
    override fun getDataList() : List<Person>?
}