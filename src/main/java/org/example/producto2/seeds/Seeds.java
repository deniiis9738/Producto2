package org.example.producto2.seeds;

import org.example.producto2.models.entity.Menu;
import org.example.producto2.models.entity.Producto;
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

        Producto productPollo = new Producto("Pollo",5.00);
        Producto productSeitan = new Producto("Seitan",7.00);
        Producto productTofu = new Producto("Tofu",6.50);
        Producto productTernera = new Producto("Ternera",5.50);
        Producto productSetas = new Producto("Setas",2.00);
        productoRepository.save(productPollo);
        productoRepository.save(productSeitan);
        productoRepository.save(productTofu);
        productoRepository.save(productTernera);
        productoRepository.save(productSetas);



    }
}




