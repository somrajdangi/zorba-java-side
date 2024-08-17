package com.third;

public class UseRefVarTypeCasting {

	public static void main(String[] args) {

		Automobile automobile1 = new Bike();
		Automobile automobile2 = new Car();

		automobile1.speed(); // bike

		// Explicit casting
		Bike bike = (Bike) automobile1;
		Car car = (Car) automobile2;
		bike.speed(); // bike
		car.speed(); // car

		// Car c1= (Car) automobile1;
		// ClassCastException -> irrelevant type casting it is
		// c1.speed(); //Bike
		System.out.println("************** use of ref variable type casting **************");
		Automobile auto[] = { new Bike() // -index-0
				, new Car(), new Automobile() };
		for (Automobile obj : auto) {
			if (obj instanceof Car) {
				Car c = (Car) obj;
				c.wheelCount();
			} else if (obj instanceof Bike) {
				Bike b = (Bike) obj;
				b.wheelCount();
			} else {
				obj.speed();
			}
		}
	}

}

class Automobile {
	public void speed() {
		System.out.println("Speed of Automobile");
	}
}

class Bike extends Automobile {
	public void speed() {
		System.out.println("Speed of Bike");
	}

	public void wheelCount() {
		System.out.println("Wheel count is 2");
	}
}

class Car extends Automobile {
	public void speed() {
		System.out.println("Speed of Car");
	}

	public void wheelCount() {
		System.out.println("Wheel count is 4");
	}
}