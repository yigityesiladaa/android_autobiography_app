package com.example.biographyapp.screens

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.biographyapp.databinding.ActivityBlogBinding

class BlogActivity : AppCompatActivity() {
    private lateinit var binding : ActivityBlogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = "https://github.com/yyigityesiladaa"
        binding.blogWebView.webViewClient = CustomWebViewClient()
        binding.blogWebView.settings.javaScriptEnabled = true
        binding.blogWebView.loadUrl(url)
    }
}

class CustomWebViewClient : WebViewClient(){
    override fun shouldOverrideUrlLoading(
        view: WebView?,
        request: WebResourceRequest?
    ): Boolean {
        Log.d("shouldOverrideUrlLoading","Loading...")
        return super.shouldOverrideUrlLoading(view, request)
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        Log.d("onPageFinished","Finished!")
        super.onPageFinished(view, url)
    }

    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        Log.d("onPageStarted","Started!")
        super.onPageStarted(view, url, favicon)
    }
}