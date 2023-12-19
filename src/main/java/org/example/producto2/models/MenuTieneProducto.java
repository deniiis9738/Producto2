package org.example.producto2.models;

import jakarta.persistence.*;

import java.awt.*;

@Entity
@Table(name = "menu_tiene_producto")
public class MenuTieneProducto {

    @Id
    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @Id
    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    public MenuTieneProducto() {
    }

    public MenuTieneProducto(Producto producto, Menu menu) {
        this.producto = producto;
        this.menu = menu;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}