package com.example.profile.payload.request;

import com.example.profile.entity.Address;
import com.example.profile.entity.BillingDetails;

public class UpdateRequest {
    private Long id;
    private Address personalAddress;
    private BillingDetails billingDetails;

    public Long getId() {
        return id;
    }

    public UpdateRequest setId(Long id) {
        this.id = id;
        return this;
    }

    public Address getPersonalAddress() {
        return personalAddress;
    }

    public UpdateRequest setPersonalAddress(Address personalAddress) {
        this.personalAddress = personalAddress;
        return this;
    }

    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    public UpdateRequest setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
    }
}
