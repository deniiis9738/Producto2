package org.example.producto2.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "menu_tiene_producto")
public class MenuTieneProducto {

    @Id
    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    public MenuTieneProducto() {
    }

    public MenuTieneProducto(Product product, Menu menu) {
        this.product = product;
        this.menu = menu;
    }

    public Product getProducto() {
        return product;
    }

    public void setProducto(Product product) {
        this.product = product;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}