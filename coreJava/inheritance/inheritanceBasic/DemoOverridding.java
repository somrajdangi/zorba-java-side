package com.second;

public class DemoOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Figure {
	 void show() {
		System.out.println("Show method from Figure class");
	}
	public int calcArea(int l , int b) {
		return l*b;
	}
	public Number calcTotalArea(int l , int b) {
		return 10.10f;
	}
}

class Rectangle extends Figure {
	public void show() {
		System.out.println("Show method from Rectangle class");
	}
	public int calcArea(int l , int b) {
		return l*b;
	}
	public Integer calcTotalArea(int l , int b) {
		Integer i=l*b;
		return i;
	}
}
