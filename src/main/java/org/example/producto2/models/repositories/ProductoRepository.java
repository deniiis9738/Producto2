package org.example.producto2.models.repositories;

import org.example.producto2.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Product, Long> {
}
