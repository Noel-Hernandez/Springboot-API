package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
@Entity
public class Issue2 {
    private int ReportNumber;
    private String Description;
    private Calendar Time;
    private String Address;
    private String Phone;
    private String Email;
    private String ReportStatus;
    private int Id;
    private int IdS;
public Issue2(){}

    public Issue2(int reportNumber, String description, Calendar time, String address, String phone, String email, String reportStatus, int id, int idS) {
        ReportNumber = reportNumber;
        Description = description;
        Time = time;
        Address = address;
        Phone = phone;
        Email = email;
        ReportStatus = reportStatus;
        Id = id;
        IdS = idS;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getReportNumber() {
        return ReportNumber;
    }

    public void setReportNumber(int reportNumber) {
        ReportNumber = reportNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }



    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public Calendar getTime() {
        return Time;
    }

    public void setTime(Calendar time) {
        Time = time;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getReportStatus() {
        return ReportStatus;
    }

    public void setReportStatus(String reportStatus) {
        ReportStatus = reportStatus;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdS() {
        return IdS;
    }

    public void setIdS(int idS) {
        IdS = idS;
    }
}
