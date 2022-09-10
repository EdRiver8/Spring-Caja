package com.poli.caja.Entidades;

import javax.persistence.Entity;
import java.util.Date;


public class Employee {
    private long id;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Date dateupdateAt;
    private Date createdAt;

    public Employee(long id, String email, Profile profile, Enum_RoleName role, Date dateupdateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.dateupdateAt = dateupdateAt;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public Date getDateupdateAt() {
        return dateupdateAt;
    }

    public void setDateupdateAt(Date dateupdateAt) {
        this.dateupdateAt = dateupdateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
