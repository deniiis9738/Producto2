package org.example.producto2.models.services.productoService;

import org.example.producto2.models.repositories.ProductoRepository;
import org.example.producto2.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto create(Producto product) {
        return productoRepository.save(product);
    }

    @Override
    public Producto update(Producto products) {
        Producto currentProducts= productoRepository.findById(products.getId()).get();
        currentProducts.setPrice(products.getPrice());
        currentProducts.setName(products.getName());
        return productoRepository.save(currentProducts);
    }

    @Override
    public void delete(Long id) {
        Optional<Producto> product=productoRepository.findById(id);
        System.out.println(product);
        productoRepository.deleteById(id);

    }

}
