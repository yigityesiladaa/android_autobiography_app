package com.example.biographyapp.services

import com.example.biographyapp.models.Contact
import com.example.biographyapp.models.Person
import com.example.odev_3.interfaces.IPersonService

class PersonService : IPersonService {


    override fun getDataById(id : String): Person? {
        val personContact = Contact("yy.yesilada@gmail.com","+90 553 766 18 55","Bolu/Merkez")
        val aboutPerson = "<p><span style = 'color: rgb(239,239,239)'><strong>Who is Yakup Yigit Yesilada?</strong> </span></p>" +
                "<p><span style = 'color: rgb(239,239,239)'>Yigit was born on October 22, 1999 in the district of Ilkadim, Samsun. He completed his primary education at 23 Nisan Primary School, his secondary education at Sehit Yuzbasi Tunc Fidaner Secondary School, his high school education at Koksal Ersayın Anatolian High School and finally his university education at Bolu Abant Izzet Baysal University Computer Engineering Department.</span></p> " +
                "<p><span style = 'color: rgb(239,239,239)'><strong>What Are Yigit&apos;s Interests?</strong></span></p>" +
                "<p><span style = 'color: rgb(239,239,239)'>In addition to making progress in software, Yigit has been involved in Turkish Rap music since 2018. Apart from this, he has been holding a license in Muay-Thai in the field of sports between 2017 and 2018, and since 2018 he has been continuing individual training in Muay-Thai and Wing-Tsun without a license. </span></p>" +
                "<p><span style = 'color: rgb(239,239,239)'><strong>Software Career</strong></span></p>" +
                "<p><span style = 'color: rgb(239,239,239)'>Yigit, who previously worked at companies such as Pusholder and Yeterly, has been partly in the process of self-development on Flutter between June 2020 and the last months of 2021. While in this process, he developed the mobile application named Pusholder in 2020 and later worked as a freelancer for 8 months in the company named Yeterly in 2022. Apart from these, he is currently working on a new and big project with his own team and has started to work with his team for an application that can be used worldwide in the future. He also receives training in Kotlin in the &quot;Investing in Young People, Software for the Future&quot; project managed by Turkcell.</span></p> <p><br></p>"
        val personImageUrl =
            "https://media.licdn.com/dms/image/C4D03AQHn8sOCzlCNEg/profile-displayphoto-shrink_800_800/0/1668094522403?e=2147483647&v=beta&t=fpKd0k3JTobRD9owXf2ycOu2QaLBJkCRHrTCbMI2Luw"
        return Person(id,"Yakup Yigit", "Yesilada", 24, aboutPerson, personImageUrl,personContact)
    }

    override fun getDataList(): List<Person>? {
        //This function has been added as I will make the app a biopic of many people in the future.
        return null
    }
}