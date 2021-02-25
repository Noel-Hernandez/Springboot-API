package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "Nationality")
public class Nationality {

    private int NationalityId;
    private String Name;

    public Nationality(){

    }

    public Nationality(int nationalityId, String name) {
        NationalityId = nationalityId;
        Name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(int nationalityId) {
        NationalityId = nationalityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
