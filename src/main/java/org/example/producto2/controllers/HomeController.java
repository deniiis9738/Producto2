package org.example.producto2.controllers;

import org.example.producto2.models.services.menuService.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("menus", menuService.findAll());
        model.addAttribute("currentPage", "home");
        return "base_layout";
    }
}
