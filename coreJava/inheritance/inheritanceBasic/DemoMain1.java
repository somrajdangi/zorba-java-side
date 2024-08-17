package com.first;

public class DemoMain1 {

	public static void main(String[] args) {
		B objB = new B();
		objB.show();
		
		C objC = new C();
		objC.show();
		
		D objD = new D();
		objD.show();

	}

}

class A{
	public void show() {
		System.out.println("Show from Class A");
	}
}
class B extends A{
	public void show() {
		System.out.println("Show from Class B");
	}
}
class D extends B{
}
class C  extends A{
	
}