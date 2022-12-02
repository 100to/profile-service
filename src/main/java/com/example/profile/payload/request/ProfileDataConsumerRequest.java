package com.example.profile.payload.request;

public class ProfileDataConsumerRequest {
    private Long id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String email;

    public Long getId() {
        return id;
    }

    public ProfileDataConsumerRequest setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public ProfileDataConsumerRequest setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getMiddlename() {
        return middlename;
    }

    public ProfileDataConsumerRequest setMiddlename(String middlename) {
        this.middlename = middlename;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public ProfileDataConsumerRequest setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ProfileDataConsumerRequest setEmail(String email) {
        this.email = email;
        return this;
    }
}
