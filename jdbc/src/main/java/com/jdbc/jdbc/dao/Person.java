package com.jdbc.jdbc.dao;


import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Entity
//@Table(name="person")
public class Person {

    @Id
//    @GeneratedValue
    private int id;
//    @Column(name="name")
    private String name;
    private String location;
    private Date date;


    public Person(){

    }

    public Person(int id, String name, String location, Date date) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}
