package com.third;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		A a = new A();
		A a1 = new B();
		A a2 = new C();
		a.X();
		
		a1.X();
		B b1= (B) a1;
		b1.Y();
		
		a2.X();
		
		B b = (B) a2;
		b.Y();
		
		C c1 = (C) a2;
		c1.Z();
	}

}
class A{
	public void X() {
		System.out.println("Class A method X()");
	}
}
class B extends A{
	public void Y() {
		System.out.println("Class B method Y()");
	}
}
class C extends B{
	public void X() {
		System.out.println("Class C method X()");
	}
	public void Z() {
		System.out.println("Class C method Z()");
	}
}

