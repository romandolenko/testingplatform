package com.testing.platform.internal.customer.facade;

import com.testing.platform.business.protocol.User;
import com.testing.platform.business.protocol.UserProfile;
import com.testing.platform.internal.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerServiceFacade")
public class CustomerServiceFacadeImpl implements CustomerServiceFacade {

    @Autowired
    private CustomerService customerService;

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
    public User getUserByName(String userName) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public User getUserByPhone(String phone) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
