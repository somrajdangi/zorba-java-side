package com.third;

public class ImplicitRefrenceTypeCasting {

	public static void main(String[] args) {
		
		RefB refBObj = new RefB(); 
		// refBObj IS-A type of RefA
		System.out.println(" refBObj "+refBObj);
		RefA refAObj = refBObj; // implicit reference variable type-casting
		System.out.println(" refAObj "+refAObj);
	}

}

class RefA{
	void show() {
		System.out.println("RefA class Show method called");
	}
}
class RefB extends RefA{ // IS-A relationship
	void show() {
		System.out.println("RefB class Show method called");
	}
}

