package com.example.appstuffiestienda_grupo6.repository

import com.example.appstuffiestienda_grupo6.model.Producto

class ProductoRepository {
    fun getProductos(): List<Producto> {
        return listOf(
            Producto(1, "Polera Oversize", 12990.0),
            Producto(2, "Polerón Stuffies", 19990.0),
            Producto(3, "Gorro Urbano", 7990.0)
        )
    }
}
