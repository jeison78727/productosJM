package com.axity.test.product.repository.datamodel;

import jakarta.persistence.*;

@Entity
@Table(name = "\"user\"")
public class UserEntity {
    @Id
    private String id_user;
    private String user_name;
    private String last_name;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    private Rol rol;
    private String telephone;

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
