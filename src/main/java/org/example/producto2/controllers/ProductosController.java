package org.example.producto2.controllers;

import org.example.producto2.models.entity.Producto;
import org.example.producto2.services.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductosController {
    @Autowired
    private IProductosService iProductosService;

//    @GetMapping({"/productos"})
//    public String productos(@RequestParam(name = "productos", required = true, defaultValue = "Denis") String productos, Model model) {
//        model.addAttribute("productos", productos);
//        return "productos";
//    }

    @GetMapping("/productos")
    public List<Producto> productos() {
        return iProductosService.findAll();
    }
}
