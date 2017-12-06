package com.testing.platform.integration.user.facade;

import com.testing.platform.business.protocol.User;
import com.testing.platform.integration.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services/user")
public class IntegrationUserService {

    private static final Logger log = LoggerFactory.getLogger(IntegrationUserService.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public ResponseEntity<?> registryUser(@RequestParam(value = "user", required = true) User user) {
        String userId = userService.registryUser(user);
        return new ResponseEntity<>(userId, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<?> updateUser(@RequestParam(value = "user", required = true) User user) {
        userService.updateUserProfile(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@RequestParam(value = "userId", required = true) String userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserDetails(@RequestParam(value = "userId", required = true) String userId) {
        User user = userService.getUserDetails(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<?> getUsers() {
        List<User> users = userService.getUsersDetails();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
