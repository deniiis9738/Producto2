package org.example.producto2.models.services.menuService;

import org.example.producto2.models.dao.MenuDAO;
import org.example.producto2.models.dao.MenuTieneProductoDAO;
import org.example.producto2.models.entity.Menu;
import org.example.producto2.models.entity.MenuTieneProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService implements IMenuService {

    private final MenuDAO menuDAO;
    private final MenuTieneProductoDAO menuTieneProductoDAO;

    @Autowired
    public MenuService(MenuDAO menuDAO, MenuTieneProductoDAO menuTieneProductoDAO) {
        this.menuDAO = menuDAO;
        this.menuTieneProductoDAO = menuTieneProductoDAO;
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuDAO.findAll();
    }

    @Override
    public Optional<Menu> getMenuById(Long id) {
        return menuDAO.findById(id);
    }

    @Override
    public Menu saveMenu(Menu menu) {
        return menuDAO.save(menu);
    }

    @Override
    public void deleteMenu(Long id) {
        menuDAO.deleteById(id);
    }

    @Override
    public List<MenuTieneProducto> getMenuProductos(Long menuId) {
        return menuTieneProductoDAO.findByMenuId(menuId);
    }
}
