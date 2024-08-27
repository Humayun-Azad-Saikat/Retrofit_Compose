package com.example.retrofit_compose.retrofit

import com.example.retrofit_compose.api.Apiconstants
import com.example.retrofit_compose.model.Product
import retrofit2.http.GET

interface Fakerapi {

    @GET(Apiconstants.END_POINT)
    suspend fun getProduct():List<Product>
}