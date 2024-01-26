package org.example.producto2.controllers;

import org.example.producto2.models.entity.Product;
import org.example.producto2.models.services.productoService.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/product")
    public String showProducts(Model model){
        model.addAttribute("product",productoService.findAll());
        model.addAttribute("currentPage", "product");
        return "product";
    }

    @GetMapping("/product/create")
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("currentPage", "product");
        return "create_product";
    }

    @GetMapping("/product/{productId}")
    public String updateProduct(@PathVariable Long productId, Model model) {
        Optional<Product> product = productoService.findById(productId);
        model.addAttribute("product", product);
        return "edit_product";
    }
}
