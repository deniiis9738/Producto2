package org.example.producto2.models.services.productoService;

import org.example.producto2.models.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    Producto create(Producto producto);
    Producto update(Producto producto);
    void delete(Long id);
}
