package com.testing.platform.integration.authorization.service;

import com.testing.platform.business.protocol.Principal;
import com.testing.platform.business.protocol.Session;
import com.testing.platform.internal.session.facade.SessionServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorizationService")
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    private SessionServiceFacade sessionServiceFacade;

    @Override
    public Session authenticateUser(Principal principal) {
        // check credentials and create session
        return sessionServiceFacade.createSession(principal);
    }

}
