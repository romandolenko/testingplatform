package com.testing.platform.business.protocol;

public class User {

    private String userId;

    private UserStatus userStatus;

    private Principal principal;

    private UserProfile userProfile;

    public User() {
    }

    public User(UserStatus userStatus, Principal principal, UserProfile userProfile) {
        this.userStatus = userStatus;
        this.principal = principal;
        this.userProfile = userProfile;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
