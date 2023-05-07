package com.example.biographyapp.interfaces

interface IBaseService<T> {

    //The return values are set to be null because when I advance the application, the data will be fetched dynamically over the internet instead of being static.
    fun getDataById(id : String) : T?
    fun getDataList() : List<T>?
}