package com.example.profile.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("profiles")
public class Profile {
    @Id
    private Long id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String age;
    private Date dateOfBirth;
    private String uniqueCitizenNumber;
    private Gender gender;
    private Address personalAddress;
    private BillingDetails billingDetails;

    public Long getId() {
        return id;
    }

    public Profile setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Profile setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getMiddlename() {
        return middlename;
    }

    public Profile setMiddlename(String middlename) {
        this.middlename = middlename;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Profile setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Profile setAge(String age) {
        this.age = age;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Profile setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getUniqueCitizenNumber() {
        return uniqueCitizenNumber;
    }

    public Profile setUniqueCitizenNumber(String uniqueCitizenNumber) {
        this.uniqueCitizenNumber = uniqueCitizenNumber;
        return this;
    }

    public Address getPersonalAddress() {
        return personalAddress;
    }

    public Profile setPersonalAddress(Address personalAddress) {
        this.personalAddress = personalAddress;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Profile setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    public Profile setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
    }
}
