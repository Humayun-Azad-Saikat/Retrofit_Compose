package com.example.retrofit_compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.retrofit_compose.model.Product
import com.example.retrofit_compose.viewmodels.MainviewModel

@Composable
fun ListScreen(){
    
    val mainviewModel = viewModel(modelClass = MainviewModel::class.java)

    val state by mainviewModel.state.collectAsState()

    LazyColumn {
        if (state.isEmpty()){
           item {
//               CircularProgressIndicator(
//                   modifier = Modifier
//                       .fillMaxSize()
//                       .wrapContentSize(align = Alignment.Center)
//               )
           }
        }

        items(state){product:Product->
            Text(text = "${product.title}")
        }

 }
    
}