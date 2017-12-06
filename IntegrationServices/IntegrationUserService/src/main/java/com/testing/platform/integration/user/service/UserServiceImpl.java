package com.testing.platform.integration.user.service;

import com.testing.platform.business.protocol.User;
import com.testing.platform.business.protocol.UserProfile;
import com.testing.platform.business.protocol.exception.BusinessException;
import com.testing.platform.internal.customer.facade.CustomerServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private CustomerServiceFacade customerServiceFacade;

    @Override
    public String registryUser(User user) {
        User userExist = customerServiceFacade.getUserByName(user.getPrincipal().getLogon());
        if (userExist != null) {
            throw new BusinessException("UserService", "registryUser", "User already exist!");
        }
        return customerServiceFacade.createPrinciple(user).getUserId();
    }

    @Override
    public void createUserProfile(UserProfile userProfile) {
        if (userProfile.getEmail() != null) {
            String emailName = userProfile.getEmail().getEmailName();
            if (emailName != null && !emailName.isEmpty()) {
                User emailUser = customerServiceFacade.getUserByEmail(emailName);
                if (emailUser != null) {
                    throw new BusinessException("UserService", "createUserProfile", "Email already used!");
                }
            }
        }
        customerServiceFacade.createUserProfile(userProfile);
    }

    @Override
    public void updateUserProfile(UserProfile userProfile) {
        customerServiceFacade.updateProfile(userProfile);
    }

    @Override
    public void deleteUser(String userId) {
        User userExist = customerServiceFacade.getUserDetails(userId);
        if (userExist == null) {
            throw new BusinessException("UserService", "deleteUser", "User is not found!");
        }
        customerServiceFacade.deleteUser(userId);
    }

    @Override
    public User getUserDetails(String userId) {
        return customerServiceFacade.getUserDetails(userId);
    }

    @Override
    public List<User> getUsersDetails() {
        return customerServiceFacade.getUsers();
    }
}
