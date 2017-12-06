package com.testing.platform.internal.session.facade;

import com.testing.platform.business.protocol.Principal;
import com.testing.platform.business.protocol.Session;

public interface SessionServiceFacade {

    Session createSession(Principal principal);

    Session closeSession(Principal principal);

}
