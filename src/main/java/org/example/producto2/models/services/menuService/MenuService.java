package org.example.producto2.models.services.menuService;

import org.example.producto2.models.repositories.MenuRepository;
import org.example.producto2.models.repositories.MenuTieneProductoRepository;
import org.example.producto2.models.entity.Menu;
import org.example.producto2.models.entity.MenuTieneProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService implements IMenuService {

    private final MenuRepository menuRepository;
    private final MenuTieneProductoRepository menuTieneProductoRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository, MenuTieneProductoRepository menuTieneProductoRepository) {
        this.menuRepository = menuRepository;
        this.menuTieneProductoRepository = menuTieneProductoRepository;
    }

    @Override
    public List<Menu> getAllMenus() {
        return (List<Menu>) menuRepository.findAll();
    }

    @Override
    public Optional<Menu> getMenuById(Long id) {
        return menuRepository.findById(id);
    }

    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }

    @Override
    public List<MenuTieneProducto> getMenuProductos(Long menuId) {
        return menuTieneProductoRepository.findByMenuId(menuId);
    }
}
