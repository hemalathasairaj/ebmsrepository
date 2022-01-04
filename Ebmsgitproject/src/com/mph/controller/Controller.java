package com.mph.controller;
import java.util.Scanner;
import com.mph.model.Calculator;

public class Controller 
{
	  Calculator cal;
	  public void addnumbers() 
	   {
	     System.out.println("This is controller part of Ebmsgitproject");
	     System.out.println("code started from here");
	     cal=new Calculator();
	     int a,b;
       	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter first number");
             a = sc.nextInt();
	     cal.setA(a);
	     System.out.println("Enter Second number");
	     b = sc.nextInt();
	     cal.setB(b);
             System.out.println(cal);	        
	    }	 
}
