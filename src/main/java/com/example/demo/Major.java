package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "Major")
public class Major {

    private int MajorId;
    private String Name;

    public Major(){

    }

    public Major(int majorId, String name) {
        MajorId = majorId;
        Name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMajorId() {
        return MajorId;
    }

    public void setMajorId(int majorId) {
        MajorId = majorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
