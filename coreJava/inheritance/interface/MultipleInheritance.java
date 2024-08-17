package com.inter;

public class MultipleInheritance implements MyInter1 , MyInter2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int showData() {
		return i;
	}

	@Override
	public void doWork() {
		
	}

	@Override
	public int doInit() {
		
	}
	
	public void doInit() { // both interface should have same method signature
		
	}


}


interface MyInter1{
	public static final int i=10;
	void doWork();
	void doInit();
}
interface MyInter2{
	int j=0; // by default variables are public static and final
	public abstract int showData();
	
	int doInit();
	
}