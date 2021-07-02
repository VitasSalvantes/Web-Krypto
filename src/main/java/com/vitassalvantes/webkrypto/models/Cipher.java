package com.vitassalvantes.webkrypto.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cipher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name, description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Cipher() {

    }

    public Cipher(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
