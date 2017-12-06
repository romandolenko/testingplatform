package com.testing.platform.business.protocol;

public class UserProfile {

    private Email email;

    private Phone phone;

    private Address address;

    public UserProfile() {
    }

    public UserProfile(Email email, Phone phone, Address address) {
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
