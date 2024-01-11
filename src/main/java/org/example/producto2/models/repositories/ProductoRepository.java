package org.example.producto2.models.repositories;

import org.example.producto2.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
