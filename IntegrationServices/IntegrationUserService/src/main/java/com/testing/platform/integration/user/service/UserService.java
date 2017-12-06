package com.testing.platform.integration.user.service;

import com.testing.platform.business.protocol.User;
import com.testing.platform.business.protocol.UserProfile;

import java.util.List;

public interface UserService {

    String registryUser(User user);

    void createUserProfile(UserProfile userProfile);

    void updateUserProfile(UserProfile userProfile);

    void deleteUser(String userId);

    User getUserDetails(String userId);

    List<User> getUsersDetails();
}
