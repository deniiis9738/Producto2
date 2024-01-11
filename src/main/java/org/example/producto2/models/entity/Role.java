package org.example.producto2.models.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role(){}

    @ManyToMany(mappedBy = "rolesAssociated", fetch = FetchType.LAZY)
    private Set<Usuario> usersAssociated = new LinkedHashSet<>();

    public Set<Usuario> getUsersAssociated() {
        return usersAssociated;
    }

    public void setUsersAssociated(Set<Usuario> usersAssociated) {
        this.usersAssociated = usersAssociated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}