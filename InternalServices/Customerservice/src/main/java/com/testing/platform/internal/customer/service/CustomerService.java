package com.testing.platform.internal.customer.service;

import com.testing.platform.business.protocol.User;
import com.testing.platform.business.protocol.UserProfile;

import java.util.List;

public interface CustomerService {

    User createPrinciple(User user);

    UserProfile createUserProfile(UserProfile userProfile);

    void updateProfile(UserProfile userProfile);

    void deleteUser(String userId);

    User getUserDetails(String userId);

    List<User> getUsers();
}
