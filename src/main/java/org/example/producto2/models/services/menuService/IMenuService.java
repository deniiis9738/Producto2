package org.example.producto2.models.services.menuService;

import org.example.producto2.models.entity.Menu;
import org.example.producto2.models.entity.MenuTieneProducto;

import java.util.List;
import java.util.Optional;

public interface IMenuService {

    List<Menu> getAllMenus();

    Optional<Menu> getMenuById(Long id);

    Menu saveMenu(Menu menu);

    void deleteMenu(Long id);

    List<MenuTieneProducto> getMenuProductos(Long menuId);
}
