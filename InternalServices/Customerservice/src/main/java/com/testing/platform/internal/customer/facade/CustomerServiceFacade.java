package com.testing.platform.internal.customer.facade;

import com.testing.platform.business.protocol.User;
import com.testing.platform.business.protocol.UserProfile;

import java.util.List;

public interface CustomerServiceFacade {

    User createPrinciple(User user);

    UserProfile createUserProfile(UserProfile userProfile);

    void updateProfile(UserProfile userProfile);

    void deleteUser(String userId);

    User getUserDetails(String userId);

    User getUserByName(String userName);

    User getUserByEmail(String email);

    User getUserByPhone(String phone);

    List<User> getUsers();
}
