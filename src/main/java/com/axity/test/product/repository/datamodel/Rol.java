package com.axity.test.product.repository.datamodel;


import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;
    private String name;
    private boolean is_admin;
    private boolean can_create;
    private boolean can_read;
    private boolean can_update;
    private boolean can_delete;

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    public boolean isCreate() {
        return can_create;
    }

    public void setCreate(boolean can_create) {
        this.can_create = can_create;
    }

    public boolean isRead() {
        return can_read;
    }

    public void setRead(boolean can_read) {
        this.can_read = can_read;
    }

    public boolean isUpdate() {
        return can_update;
    }

    public void setUpdate(boolean can_update) {
        this.can_update = can_update;
    }

    public boolean isDelete() {
        return can_delete;
    }

    public void setDelete(boolean can_delete) {
        this.can_delete = can_delete;
    }
}
