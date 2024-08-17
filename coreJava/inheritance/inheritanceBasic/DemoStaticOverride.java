package com.second;

public class DemoStaticOverride {
int i=10;
	public static void main(String[] args) {
		Second second = new Second();
		second.doWork();
		second.doTempWork();
		First first = new Second();
		first.doWork();
		first.doTempWork();
		//System.out.println(this.i);
		
	}

}

class First{
	public static void doWork() {
		System.out.println("Static doWork from class First");
	}
	public void doTempWork() {
		System.out.println(" doTempWork from class First");
	}
}

class Second extends First{
	public static void doWork() {
		System.out.println("Static doWork from class Second");
		First.doWork();
		//super.
	}
	public void doTempWork() {
		System.out.println(" doTempWork from class Second");
		First.doWork();
	}
}
