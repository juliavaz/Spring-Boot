package com.example.cruddemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false, length = 100)
    @NotBlank (message = "Name is mandatory")
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    @NotBlank(message = "Email is mandatory")
    private String email;

    public User(){ }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
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
