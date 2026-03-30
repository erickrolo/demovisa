package com.example.demovisa.model;



import jakarta.persistence.*;

@Entity
public class VisaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String applicantName;
    private String country;
    private String status;

    public VisaModel() {
    }

    public VisaModel(String applicantName, String country, String status) {
        this.applicantName = applicantName;
        this.country = country;
        this.status = status;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}