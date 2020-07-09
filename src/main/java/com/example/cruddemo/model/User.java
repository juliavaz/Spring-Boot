package com.example.cruddemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    public User(){ }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // @NotBlank (message = "Name is mandatory")
    private String name;

    // @NotBlank (message = "Email is mandatory")
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getName() + '\'' +
                '}';
    }
}
