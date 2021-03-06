package com.ori.git.tutorial;

public class Calculator {

	// Number 1
	private int x;
	// Number 2
	private int y;
	
	// Default Constructor
	public Calculator(int a, int b){
		
		this.x = a;
		this.y = b;	
	}
	
	public int add(){
		 return x + y;		 
	}
	
	public int substract(){		
		return x - y;
	}
	
	public int multiply(){
		return x * y;
	}
	
	public int division(){
		return x / y;
	}

	@Override
	public String toString() {
		return "Calculator [x:" + x + ", y:" + y + ", add:" + add()
				+ ", substract:" + substract() + ", multiply:" + multiply()
				+ ", division:" + division() + "]";
	}	
}
