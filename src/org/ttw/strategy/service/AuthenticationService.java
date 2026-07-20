package org.ttw.strategy.service;

import org.ttw.strategy.AuthRequest;
import org.ttw.strategy.model.AuthenticationStrategy;

public class AuthenticationService {
	
	 private AuthenticationStrategy strategy;


	    public AuthenticationService(AuthenticationStrategy strategy) {
	        this.strategy = strategy;
	    }

	
	public void authenticate( AuthRequest request) {
		strategy.authenticate(request);
	}

}
