package com.example.appstuffiestienda_grupo6.viewmodel

import androidx.lifecycle.ViewModel
import com.example.appstuffiestienda_grupo6.model.Producto
import com.example.appstuffiestienda_grupo6.repository.ProductoRepository

class HomeViewModel : ViewModel() {
    private val repo = ProductoRepository()
    val productos: List<Producto> = repo.getProductos()
}
