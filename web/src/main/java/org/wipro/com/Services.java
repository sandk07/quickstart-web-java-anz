package org.wipro.com;

public class Services {
	
	public static UserDetails login(UserDetails user){
		String firstname = user.getFirstName();
		String lastname = user.getLastName();
		
		user.setFirstName(firstname);
		user.setLastName(lastname);
		
		return user;
		
	}
	
}

