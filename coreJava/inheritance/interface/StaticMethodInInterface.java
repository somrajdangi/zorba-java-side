package com.inter;

public class StaticMethodInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface InterWithStaticMethod {
	// define complete methods in interface . default keyword or static keyword
	// should be used. static method can not be overridden 
	// 1. Static methods
	public static void init() {
		System.out.println("static method from iterface");
	}
	void doWork();
}

class StaticA implements InterWithStaticMethod {

	@Override
	public void doWork() {
		InterWithStaticMethod.init();
	}
	
	
}

/*1.  Create an interface I1
		- void showData();
   Create class DemoAbs
   		- abstract void showData();
   		- void doWork() {}
   Create class Main 
   		- extend DemoAbs and implement I1
   What would be the implementation in Main class.

2.  Create an interface I1
		- void showData();
		- static/default method validate() {}
   Create class DemoAbs
   		- abstract void showData();
   		- void validate();
   		- void doWork() {}
   Create class Main 
   		- extend DemoAbs and implement I1
   What would be the implementation in Main class.

*/