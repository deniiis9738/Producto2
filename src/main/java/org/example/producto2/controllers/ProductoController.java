package org.example.producto2.controllers;

import org.example.producto2.models.entity.Producto;
import org.example.producto2.models.services.productoService.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/product")
    public String products(Model model){
        model.addAttribute("product",productoService.findAll());
        model.addAttribute("currentPage", "product");
        return "product";
    }

    @GetMapping("/product/create")
    public String createProduct(Model model) {
        model.addAttribute("product", new ProductoService());
        model.addAttribute("currentPage", "product");
        return "create_product";
    }

    @PostMapping("/product/save")
    public String newMenu(Model model, @ModelAttribute("product") Producto product) {
        productoService.create(product);
        return "redirect:/product";
    }

}
