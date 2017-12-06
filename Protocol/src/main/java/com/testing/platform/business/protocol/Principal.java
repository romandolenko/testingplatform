package com.testing.platform.business.protocol;

public class Principal {

    private String logon;

    private String password;

    public Principal() {
    }

    public Principal(String logon, String password) {
        this.logon = logon;
        this.password = password;
    }

    public String getLogon() {
        return logon;
    }

    public void setLogon(String logon) {
        this.logon = logon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
