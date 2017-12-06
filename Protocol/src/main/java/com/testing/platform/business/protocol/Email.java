package com.testing.platform.business.protocol;

public class Email {

    private String emailName;

    private EmailStatus emailStatus;

    public Email() {
    }

    public Email(String emailName, EmailStatus emailStatus) {
        this.emailName = emailName;
        this.emailStatus = emailStatus;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public EmailStatus getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(EmailStatus emailStatus) {
        this.emailStatus = emailStatus;
    }
}
