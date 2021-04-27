package com.createiq.apr2.ShallowClone;



public class UserTest {
       public static void main(String[] aa) throws CloneNotSupportedException {
    	
     Name n=new Name("jbava","kah");
     User us=new User(1,n,"java");
     
     System.out.println("before clone"+us);
     System.out.println("before clone"+us.getN());
     
     
     User user=(User)us.clone();
		System.out.println(user);
		System.out.println(user.getN());
		System.out.println(us.getN()==user.getN());
		System.out.println(us==user);
	
	

}
}
