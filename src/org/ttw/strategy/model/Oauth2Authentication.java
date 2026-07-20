package org.ttw.strategy.model;

import org.ttw.strategy.AuthRequest;

public class Oauth2Authentication  implements AuthenticationStrategy{

	@Override
	public void authenticate(AuthRequest request) {
		// TODO Auto-generated method stub\
		
		System.out.println("authentication with oauth 2 continue");
		
	}

	
	

}
