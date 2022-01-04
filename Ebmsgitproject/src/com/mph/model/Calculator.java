package com.mph.model;

public class Calculator {
	 private int  a;
	 private  int b;
	public Calculator() {
		System.out.println("from calculator constructor");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "[Sum=" + a + "+" + b+ "="+(a+b)+"]";
	}
	 

}

