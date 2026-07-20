	package org.ttw.strategy.model;

import org.ttw.strategy.AuthRequest;

public interface AuthenticationStrategy {
		
		void authenticate(AuthRequest request);
	
	}
