package com.testing.platform.business.protocol;

public class Phone {

    private String phoneName;

    private PhoneStatus phoneStatus;

    public Phone(){}

    public Phone(String phoneName, PhoneStatus phoneStatus) {
        this.phoneName = phoneName;
        this.phoneStatus = phoneStatus;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public PhoneStatus getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(PhoneStatus phoneStatus) {
        this.phoneStatus = phoneStatus;
    }
}
