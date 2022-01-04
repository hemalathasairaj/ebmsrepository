package com.mph.view;

import java.util.Scanner;
import com.mph.controller.Controller;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      		System.out.println("hello");
		System.out.println("Happy new year");
		System.out.println("Hello guys");
		System.out.println("Welcome to EBMS");
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter Second number");
		b = sc.nextInt();
		
		Controller c = new Controller();
		c.addnumbers();

	}

}
