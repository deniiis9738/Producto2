package org.example.producto2.models.services.productoService;

import org.example.producto2.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
}
