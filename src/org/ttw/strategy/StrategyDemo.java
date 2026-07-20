package org.ttw.strategy;

import org.ttw.strategy.model.JwtAuthentication;
import org.ttw.strategy.service.AuthenticationService;

public class StrategyDemo {
	
	public static void main(String[] args) {
	 AuthenticationService  authService = new AuthenticationService( new JwtAuthentication());
	 
	
		
		 
		authService.authenticate(new AuthRequest("johndoe", "john123"));
	}

}
