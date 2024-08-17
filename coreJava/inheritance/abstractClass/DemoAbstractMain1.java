package com.fifth;

public class DemoAbstractMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class AbstractClass1 {

	public void show() {
		System.out.println("Show method from AbstractClass1 called");
	}

	abstract void doWork(); // abstract method which makes class as in-complete
}

class Complete1 extends AbstractClass1 {
	void doWork() {
		System.out.println("Abstract method completed in Complete1");
	}

	public void show() {
		System.out.println("Show method from Complete1 called");
	}
}

class Complete2 extends AbstractClass1 {
	void doWork() {
		System.out.println("Abstract method completed in Complete2");
	}

	public void show() {
		System.out.println("Show method from Complete2 called");
	}
}