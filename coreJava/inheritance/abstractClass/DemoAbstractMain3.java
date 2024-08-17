package com.fifth;

public class DemoAbstractMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a new A() {
		};
	}

}

abstract class A {
	private abstract void doWork(); 
	// can not be defined as private or abstract together
	final abstract void doWork1(); 
	// final keyword can not be used as it can not be overridden in chide class
	public void show() {
		
	}
}

// complete it by 16-July-2024
// Create an abstract class with abstract static method.
// Write program to show the constructor calling in abstract class parent and child class.
// Write program to show abstract method with method overloading.
// define class and make constroctor as private . Is it possible or not?

