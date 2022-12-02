package com.example.profile.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("addresses")
public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String streetNumber;

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public Address setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }
}
