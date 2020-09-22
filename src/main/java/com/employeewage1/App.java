package com.employeewage1;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        wageTotalDaily();
        wageTotalPart();
    }
     public static void wageTotalDaily(){
		
		int w = 0;
		
		for(int i=0;i<=20;i++){
		  w=i*8*20;
		}
		System.out.println(w);
	}
     public static void wageTotalPart() {
    	 int w=0;
    	 for(int i=0;i<=100;i++) {
    		 w=i*1*20;
    	 }
    	 System.out.println(w);
     }
   
}


