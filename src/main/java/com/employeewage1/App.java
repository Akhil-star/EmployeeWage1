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
    	
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter daily/part");
    	int n=sc.nextInt();
        switch(n)
        {
                case 1 :
                calDailywage();
                break;
                case 2 :
                addParttime();
                break;
		        default :
                System.out.println("Invalid");
                break;
         }
    }
        public static void addParttime(){
        	int wage;
        	wage=20*8;
        	System.out.println(wage);
        }
        public static void calDailywage() {
        	int wage;
        	wage=20*8;
        	System.out.println(wage);
        }
   
}


