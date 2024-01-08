package org.example.producto2.models.dao;

import org.example.producto2.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductosDAO extends CrudRepository<Producto, Long> {
}
