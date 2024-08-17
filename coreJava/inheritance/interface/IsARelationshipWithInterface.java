package com.inter;

public class IsARelationshipWithInterface {

	public static void main(String[] args) {
		
		Vechicle v= Automobile.getVechileObj();		
		System.out.println(v.engineType());
	}

}

interface Vechicle {
	
	int speed();
	String engineType();
	int wheelCount();
}
class Automobile{
	
	static Vechicle getVechileObj() {
		return new Bike();
	}
}

class Bike implements Vechicle{

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String engineType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int wheelCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Car implements Vechicle{
	
	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String engineType() {
		// TODO Auto-generated method stub
		return "SUPER_POWER";
	}

	@Override
	public int wheelCount() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}
