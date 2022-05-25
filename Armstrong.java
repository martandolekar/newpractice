package com.java.logicalprogramming;

public class Armstrong_Number {

	public static void main(String[] args) 
	{
		int no=153; 		
		int rem=0;
		int sum=0;    
		int act=no;    
		while(no>0)    
		 {    
			 rem=no%10;    
			 sum=sum+(rem*rem*rem);    
			 no=no/10;    
		 }    
		 if(act==sum)    
		 {
			 System.out.println(act+" is armstrong  number ");    
		 }
		 else    
		 {
			System.out.println(act+" is not armstrong number");    
		 }   
	}
}