package org.example.producto2.models.services.menuService;

import org.example.producto2.models.entity.Menu;

import java.util.List;
import java.util.Optional;

public interface IMenuService {
    List<Menu> findAll();
    Optional<Menu> findById(Long id);
    Menu create(Menu menu);
    Menu update(Menu menu);
    void delete(Long id);
}
