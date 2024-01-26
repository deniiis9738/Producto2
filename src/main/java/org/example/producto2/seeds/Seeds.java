package org.example.producto2.seeds;

import org.example.producto2.models.entity.Menu;
import org.example.producto2.models.entity.Product;
import org.example.producto2.models.repositories.MenuRepository;
import org.example.producto2.models.repositories.ProductoRepository;

public class Seeds {
    private MenuRepository menuRepository;
    private ProductoRepository productoRepository;

    public Seeds(MenuRepository menuRepository, ProductoRepository productoRepository)  {
        this.menuRepository = menuRepository;
        this.productoRepository = productoRepository;
    }

    public void generateSeeds(){
        Menu menuLibanes = new Menu("Libanes", 30.5);
        Menu menuVeggie = new Menu("Veggie", 20);
        Menu menuBurguer = new Menu("Libanes", 25);
        menuRepository.save(menuLibanes);
        menuRepository.save(menuVeggie);
        menuRepository.save(menuBurguer);

        Product productPollo = new Product("Pollo",5.00);
        Product productSeitan = new Product("Seitan",7.00);
        Product productTofu = new Product("Tofu",6.50);
        Product productTernera = new Product("Ternera",5.50);
        Product productSetas = new Product("Setas",2.00);
        productoRepository.save(productPollo);
        productoRepository.save(productSeitan);
        productoRepository.save(productTofu);
        productoRepository.save(productTernera);
        productoRepository.save(productSetas);



    }
}




