package org.example.producto2.models;

import jakarta.persistence.*;

import java.awt.*;

@Entity
@Table(name = "usuario_pide_menu")
public class UsuarioPideMenu {

    @Id
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    public UsuarioPideMenu() {
    }

    public UsuarioPideMenu(Usuario usuario, Menu menu) {
        this.usuario = usuario;
        this.menu = menu;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
