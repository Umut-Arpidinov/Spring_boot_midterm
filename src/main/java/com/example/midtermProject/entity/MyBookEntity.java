package com.example.midtermProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "myBooks")
public class MyBookEntity {
    @Id
    private int id;
    private String name;
    private String author;
    private Boolean availability;


    public MyBookEntity(){}

    public MyBookEntity(int id, String name, String author, Boolean availability) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}