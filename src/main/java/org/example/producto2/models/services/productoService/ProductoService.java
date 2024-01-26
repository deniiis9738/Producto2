package org.example.producto2.models.services.productoService;

import org.example.producto2.models.entity.Product;
import org.example.producto2.models.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Product> findAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Product create(Product product) {
        return productoRepository.save(product);
    }

    @Override
    public Product update(Product products) {
        Product currentProducts= productoRepository.findById(products.getId()).get();
        currentProducts.setPrice(products.getPrice());
        currentProducts.setName(products.getName());
        return productoRepository.save(currentProducts);
    }

    @Override
    public void delete(Long id) {
        Optional<Product> product=productoRepository.findById(id);
        System.out.println(product);
        productoRepository.deleteById(id);

    }

}
