package com.nhkim.retrofit_ex

import retrofit2.Call
import retrofit2.http.GET

interface MyApi {
    @GET("posts/1")
    fun getPost1(): Call<Post>
}