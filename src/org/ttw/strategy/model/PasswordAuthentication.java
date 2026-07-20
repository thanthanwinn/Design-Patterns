package org.ttw.strategy.model;

import org.ttw.strategy.AuthRequest;

public class PasswordAuthentication  implements AuthenticationStrategy{

	@Override
	public void authenticate(AuthRequest request) {
		// TODO Auto-generated method stub
		System.out.println("continue to authenticate with user name and password");
		
	}

}
