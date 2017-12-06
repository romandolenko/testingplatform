package com.testing.platform.integration.authorization.service;

import com.testing.platform.business.protocol.Principal;
import com.testing.platform.business.protocol.Session;

public interface AuthorizationService {

    Session authenticateUser(Principal principal);

}
