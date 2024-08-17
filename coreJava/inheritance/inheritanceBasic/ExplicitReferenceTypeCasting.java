package com.third;

public class ExplicitReferenceTypeCasting {

	public static void main(String[] args) {
		
		RefA refAObj = new RefA();
		
		RefB refB= (RefB)refAObj; // explicit
		// RefB refB = new RefA(); not allowed
		
		RefA refAObj1 = new RefB();
		RefB refB1= (RefB) refAObj1; // explicit
	}

}
