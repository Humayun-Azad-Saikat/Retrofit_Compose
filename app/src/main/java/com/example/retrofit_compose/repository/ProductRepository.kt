package com.example.retrofit_compose.repository

import com.example.retrofit_compose.model.Product
import com.example.retrofit_compose.retrofit.Fakerapi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerapi: Fakerapi) {

    suspend fun getProducts():List<Product>{
        return fakerapi.getProduct()
    }

}