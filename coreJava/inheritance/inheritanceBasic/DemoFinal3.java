package com.fourth;

public class DemoFinal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A {
	public final void doWork() {
		System.out.println("Class A doWork()");
	}
	public void doWork(int i) {
		System.out.println("Class A overloaded doWork()");
	}
}
class B extends A{
	/*public final void doWork() {
		System.out.println("Class A doWork()");
	}*/
}