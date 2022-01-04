package com.mph.model;

public class Calculator {
	 private int  a;
	 private  int b;
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
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
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	 

}

