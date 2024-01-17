package org.example.producto2.controllers;

import org.example.producto2.models.entity.Menu;
import org.example.producto2.models.services.menuService.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/menus")
    public String getMenus(Model model){
        model.addAttribute("menus", menuService.findAll());
        model.addAttribute("currentPage", "menus");
        return "menus";
    }

    @GetMapping("/menu/{id}")
    public String getMenuDetail(Model model, @PathVariable Long id) throws Exception {
        Optional<Menu> menu = Optional.ofNullable(menuService.findById(id).orElseThrow(() -> new Exception("Menu" + id + " not found")));
        if(menu.isPresent()) {
            model.addAttribute("menu", menu.get());
            model.addAttribute("currentPage", "menus");
        }
        return "edit_menu";
    }

    @PostMapping("/menu/update/{id}")
    public String updateMenu(@PathVariable("id") Long id,
                             @ModelAttribute("menu") Menu menuDetails) throws Exception {
        Optional<Menu> menu = Optional.ofNullable(menuService.findById(id).orElseThrow(() -> new Exception("Menu" + id + " not found")));
        if(menu.isPresent()){
            menu.get().setName(menuDetails.getName());
            menu.get().setPrice(menuDetails.getPrice());
            menuService.update(menu.get());
        }
        return "redirect:/menu/" + id;
    }

    @GetMapping("/menu/create")
    public String createMenu(Model model) {
        model.addAttribute("menu", new Menu());
        model.addAttribute("currentPage", "menus");
        return "create_menu";
    }

    @PostMapping("/menu/save")
    public String newMenu(Model model, @ModelAttribute("menu") Menu menu) {
        menuService.create(menu);
        return "redirect:/";
    }
}
