package com.inter;

public interface MyInterface1 {
	void show(); // by default public & abstract
	public abstract int doWork();
}


class Parent1 implements MyInterface1 {

	@Override
	public void show() {
		System.out.println("Show methos in parent1 class");
		
	}

	@Override
	public int doWork() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}