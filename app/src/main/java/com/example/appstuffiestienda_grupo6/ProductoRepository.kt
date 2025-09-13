package com.example.appstuffiestienda_grupo6.repository

import com.example.appstuffiestienda_grupo6.model.Producto

class ProductoRepository {
    fun getProductos(): List<Producto> {
        return listOf(
            Producto(1, "Leonel Pavez", .0),
            Producto(2, "Miguel Torres", .0),
            Producto(3, "Alexis Olguin", .0),
            Producto(3, "Alfonso David ", .0)
        )
    }
}
