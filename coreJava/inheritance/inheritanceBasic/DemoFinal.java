package com.fourth;

public class DemoFinal {
	public static final int i=0;
	final int j =100; // instance variable
	
	public static void main(String[] args) {
		System.out.println("Value of i "+i); // 0
//		i=100;
		System.out.println("Updated value of i "+i); // 100
		
		DemoFinal obj = new DemoFinal();
//		obj.j=20;s
		System.out.println(obj.j); //100
		
		
	}

}
