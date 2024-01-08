package org.example.producto2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping({"/home", "/index"})
    public String home(@RequestParam(name = "nombre", required = true, defaultValue = "Denis") String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        return "home";
    }
}
