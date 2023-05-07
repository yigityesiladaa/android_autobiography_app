package com.example.biographyapp.services

import android.util.Log
import com.example.biographyapp.interfaces.IGalleryService
import com.example.biographyapp.models.GalleryItem

class GalleryService : IGalleryService {

    /*
    Normally, I was going to design a code as I did in the PersonalService class in this part,
    but I preferred to do it this way in order to use the static variable definition situation.
    Therefore, instead of creating a galleryService object in GalleryActivity and accessing
    the getDataList function from there, I used GalleryServce.galleryItems to show how to call a static variable.
    The usage here is for illustrative purposes only.
     */
    companion object{
        var galleryItems = mutableListOf<GalleryItem>()
    }

    constructor(){
        Log.d("Constructor","GalleryService Secondary Constructor")
    }

     fun fillGalleryItems (){
        val item1 = GalleryItem("turkcell","Turkcell","I am currently training on Kotlin in the \"Gençlere Yatırım Geleceğe Yazılım\" project that Turkcell is running.","https://www.donanimhaber.com/images/images/haber/141662/src_340x1912xmill-egitim-bakanligi-ve-turkcell-den-isbirligi.jpg")
        val item2 = GalleryItem("bitakasla","Bi'Takasla","Currently, I am actively involved in the team called Bi'Takasla, which we have established, as the founding manager and Flutter Developer. While managing the team I have established here, I am also responsible for the earnings model planning, the preparation of the necessary documents for the investment tours and the process management.\n","https://i.hizliresim.com/8efwnoe.png")
        val item3 = GalleryItem("pusholder","Pusholder","I worked as a Flutter developer in an application called Pusholder. In this process, I worked on the UI and Flutter Backend on the related SDK.","https://www.oncevatan.com.tr/images/haberler/2021/06/yeni-nesil-medyanin-parlayan-yildizi-pusholder_6ffeb.jpg")
        val item4 = GalleryItem("yeterly","Yeterly","I worked as a Flutter developer at Yeterly. In this process, I worked on user experiences, interface coding, database connections and Flutter status management tools in a social media awareness application developed for the disabled.","https://media.licdn.com/dms/image/C560BAQECa97zZ4UuHQ/company-logo_200_200/0/1649791356006?e=2147483647&v=beta&t=tG2Cdf4P3KJtVpAtXTe4vYp-Js9ND5wyucVfCKeUbnQ")

        galleryItems.add(item1)
        galleryItems.add(item2)
        galleryItems.add(item3)
        galleryItems.add(item4)
    }

    override fun getDataById(id : String): GalleryItem? {
        var galleryItem : GalleryItem? = null
        if(galleryItems.isEmpty()){
            fillGalleryItems()
        }
        for (item in galleryItems){
            if(item.id == id){
                galleryItem = item
                break
            }
        }
        return galleryItem
    }

    override fun getDataList() : List<GalleryItem> {
        if(galleryItems.isEmpty()){
            fillGalleryItems()
        }
        return galleryItems
    }
}