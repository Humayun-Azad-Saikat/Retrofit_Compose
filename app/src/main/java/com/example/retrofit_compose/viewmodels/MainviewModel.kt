package com.example.retrofit_compose.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit_compose.model.Product
import com.example.retrofit_compose.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainviewModel @Inject constructor(productRepository: ProductRepository):ViewModel() {

    private val _state = MutableStateFlow(emptyList<Product>())
    val state:StateFlow<List<Product>>
        get() = _state

    init {
        viewModelScope.launch {
            val products = productRepository.getProducts()
            _state.value = products
        }
    }


}