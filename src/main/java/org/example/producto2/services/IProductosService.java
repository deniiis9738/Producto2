package org.example.producto2.services;

import org.example.producto2.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductosService {
    public List<Producto> findAll();
}
