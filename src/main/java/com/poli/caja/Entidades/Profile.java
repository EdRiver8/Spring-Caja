package com.poli.caja.Entidades;

import javax.persistence.*;
import java.util.Date;


public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String image;
    private String phone;
    private Date createdAt;
    private Date updateAt;

    public Profile(String id, String image, String phone, Date createdAt, Date updateAt) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
