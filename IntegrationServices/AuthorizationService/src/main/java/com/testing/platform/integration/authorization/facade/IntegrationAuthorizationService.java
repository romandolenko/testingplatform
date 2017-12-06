package com.testing.platform.integration.authorization.facade;

import com.testing.platform.business.protocol.Principal;
import com.testing.platform.business.protocol.Session;
import com.testing.platform.integration.authorization.service.AuthorizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/authorization")
public class IntegrationAuthorizationService {

    private AuthorizationService authorizationService;

    @RequestMapping(value = "/authenticateUser", method = RequestMethod.POST)
    public ResponseEntity<?> authenticateUser(@RequestParam(value = "principal", required = true) Principal principal) {
        Session session = authorizationService.authenticateUser(principal);
        return null;
    }
}
