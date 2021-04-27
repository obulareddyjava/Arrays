package com.exceptionsmar29;

public class PropagationException {
	
	    void a()  
	    {  
	        try{  
	        System.out.println("a(): Main called");  
	        b();  
	        }catch(Exception e)  
	        {  
	            System.out.println("Exception is caught");  
	        }  
	    }  
	    void b() throws Exception  
	    {  
	     try{  
	         System.out.println("b(): Main called");  
	         c();  
	     }catch(Exception e){  
	         throw new Exception();  
	     }  
	     finally   
	     {  
	         System.out.println("finally block is called");  
	     }  
	    }  
	    void c() throws Exception   
	    {  
	        throw new Exception();  
	    }  
	  
	    public static void main (String args[])  
	    {  
	    	PropagationException pe=new PropagationException();  
	        pe.a();  
	    }  
	} 

