package org.example.producto2.models.services.productoService;

import org.example.producto2.models.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product create(Product product);
    Product update(Product product);
    void delete(Long id);
}
