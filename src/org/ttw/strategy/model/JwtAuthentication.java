package org.ttw.strategy.model;

import org.ttw.strategy.AuthRequest;

public class JwtAuthentication implements AuthenticationStrategy {

	public void authenticate(AuthRequest request) {
		// TODO Auto-generated method stub
			System.out.println("authentication with JWT");
	}

}
