package com.testing.platform.internal.customer.service;

import com.testing.platform.business.protocol.User;
import com.testing.platform.business.protocol.UserProfile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Override
    public User createPrinciple(User user) {
        return null;
    }

    @Override
    public UserProfile createUserProfile(UserProfile userProfile) {
        return null;
    }

    @Override
    public void updateProfile(UserProfile userProfile) {

    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public User getUserDetails(String userId) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
