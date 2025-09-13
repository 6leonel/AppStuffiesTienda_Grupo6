package com.example.appstuffiestienda_grupo6.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appstuffiestienda_grupo6.viewmodel.HomeViewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Stuffies Tienda", style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(8.dp))

        viewModel.productos.forEach { producto ->
            Text("${producto.nombre} - $${producto.precio}")
        }
    }
}
