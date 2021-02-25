package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    private int StudentId;
    private String Name;
    private String Email;
    private String Password;
    private int Age;
    private int Nationality;
    private int Major;

    public Student(){

    }

    public Student(int studentId, String name, String email, String password, int age, int nationality, int major) {
        StudentId = studentId;
        Name = name;
        Email = email;
        Password = password;
        Age = age;
        Nationality = nationality;
        Major = major;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getNationality() {
        return Nationality;
    }

    public void setNationality(int nationality) {
        Nationality = nationality;
    }

    public int getMajor() {
        return Major;
    }

    public void setMajor(int major) {
        Major = major;
    }
}
