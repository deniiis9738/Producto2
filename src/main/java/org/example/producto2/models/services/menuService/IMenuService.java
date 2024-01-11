package org.example.producto2.models.services.menuService;

import org.example.producto2.models.entity.Menu;

import java.util.List;
import java.util.Optional;

public interface IMenuService {

    List<Menu> findAll();

    Optional<Menu> getMenuById(Long id);

    Menu saveMenu(Menu menu);

    void deleteMenu(Long id);
}
