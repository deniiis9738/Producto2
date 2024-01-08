package org.example.producto2.services;

import org.example.producto2.models.dao.IProductosDAO;
import org.example.producto2.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductosService {
    @Autowired
    private IProductosDAO iProductosDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) iProductosDAO.findAll();
    }
}
