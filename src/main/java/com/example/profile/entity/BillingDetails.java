package com.example.profile.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("billingDetails")
public class BillingDetails {
    private String debitCard;
    private String CVC;
    private String firstName;
    private String lastName;
    private Address billingAddress;

    public String getDebitCard() {
        return debitCard;
    }

    public BillingDetails setDebitCard(String debitCard) {
        this.debitCard = debitCard;
        return this;
    }

    public String getCVC() {
        return CVC;
    }

    public BillingDetails setCVC(String CVC) {
        this.CVC = CVC;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public BillingDetails setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public BillingDetails setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public BillingDetails setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }
}
