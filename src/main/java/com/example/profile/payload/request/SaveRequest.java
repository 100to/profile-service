package com.example.profile.payload.request;

import com.example.profile.entity.Address;

public class SaveRequest {
    private String firstName;
    private String middleName;
    private String lastName;
    private Address personalAddress;

    public String getFirstName() {
        return firstName;
    }

    public SaveRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public SaveRequest setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public SaveRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Address getPersonalAddress() {
        return personalAddress;
    }

    public SaveRequest setPersonalAddress(Address personalAddress) {
        this.personalAddress = personalAddress;
        return this;
    }
}
