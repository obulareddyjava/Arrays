package com.createiq.apr2.deepclone;

import com.createiq.apr2.main;

public class UserTest {
       public static void main(String[] aa)  {
    	  Name name=new Name("","");
    	  name.setFname("cat");
    	  name.setLname("Dog");
    	  name.setFname("Class");
    	  name.setLname("vgs");
    	  
    	  
    	  
    	  User user=new User(9, new Name("hjsdg","ahgxvagh"), "Forest");
    	  System.out.println("user fields before cloning");
    	  
    	  System.out.println(user);
    	  System.out.println(user.getN());
    	
    	  System.out.println("cloning Object");
        
    	  
		try {
		User 	us = (User)user.clone();
			System.out.println(us);
			System.out.println(us.getN());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		
			
		
       }
       
	
	

}
