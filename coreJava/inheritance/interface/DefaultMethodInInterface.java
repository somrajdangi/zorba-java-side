package com.inter;

public class DefaultMethodInInterface {
	int i = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultA a = new DefaultA();
		a.doWork();
	}

}

interface InterWithDefaultMethod {
	// define complete methods in interface . default keyword or static keyword
	// should be used.
	// 1. default methods
	default void validate() {
		System.out.println("Validation");
	}

	void doWork();
}

class DefaultA implements InterWithDefaultMethod {

	@Override
	public void doWork() {
		validate();
	}
	
	
}