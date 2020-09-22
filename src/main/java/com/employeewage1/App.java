package com.employeewage1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double value = Math.floor(Math.random() * 10)%2;
		
    	System.out.println("Random value : "+value);
    			
    	if(value == 1) {
    	System.out.println("Employee present");
    	} else {
    	System.out.println("Employee absent");
    	}
    }
}
