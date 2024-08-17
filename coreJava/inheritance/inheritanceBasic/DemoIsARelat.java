package com.first;

public class DemoIsARelat {

	public static void main(String[] args) {
		Car m = new Car();
		Vechile vech1 = new Vechile();
		 
		System.out.println(m instanceof Car);
		System.out.println(vech1 instanceof Vechile);
		System.out.println(m instanceof Vechile);
		
		System.out.println(vech1 instanceof Car);
		
		Vechile a = new Car();
		Vechile veh = new BMW();
		// Super class refrence variable can hold child class type Obj.
		// Vice-Versa not true
//		Car c1= new Vechile();
		
		Vechile v1= new BMW();
		Car c1 = new Car();
	}

}

class Vechile{
	public void body() {
		System.out.println("Vechile class body()");
	}
}
class Car extends Vechile{ // Car IS-A type of Vechile
	public void body() {
		System.out.println("Car class body()");
	}
}
class BMW extends Car{
	
}
// Create parent- child class
// define constructor static & non-static block
// create obj of child class
// show the calling sequence and execution sequence.