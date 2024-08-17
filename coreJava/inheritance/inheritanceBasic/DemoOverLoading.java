package com.fourth;

public class DemoOverLoading {

	public static void main(String[] args) {
		Overload1 obj = new Overload1();
		obj.calcArea(10);
	}

}
class Overload1{
	public void calcArea() {
		System.out.println("No input param method");
	}
	int calcArea(int side) {
		System.out.println("Area of Square");
		return side*side;
	}
	// Count of parameter should be different
	public void calcArea(int length ,int width) {
		System.out.println("Area of Rectangle");
	}
	// type of input param should be different
	private void calcArea(double length ,int width) { 
		System.out.println("Area of Rectangle");
	}
}
class OverloadChild extends Overload1{
	void calcArea(Object obj) {
		System.out.println("Object type input parameter method");
	}
}
