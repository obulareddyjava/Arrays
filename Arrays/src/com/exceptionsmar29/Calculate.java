package com.exceptionsmar29;

public class Calculate {
	  
	    int a;   
	    public Calculate(int a)  
	    {  
	        this.a = a;  
	    }  
	    public int add()  
	    {  
	        a = a+10;   
	        try   
	        {  
	            a = a+10;   
	            try   
	            {  
	                a = a*10;   
	                throw new Exception();   
	            }catch(Exception e){  
	                a = a - 10;  
	            }  
	        }catch(Exception e)  
	        {  
	            a = a - 10;   
	        }  
	        return a;  
	    }  
	      
	    public static void main (String args[])  
	    {  
	    	Calculate c = new Calculate(10);  
	        int result = c.add();  
	        System.out.println("result = "+result);  
	    }  
	

}
