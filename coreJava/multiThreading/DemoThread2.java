package com.thread.first;

public class DemoThread2 {

	public static void main(String[] args) {
		A a = new A("Thread-A");
		//a.setName("New-Thread-A");
		B b = new B();

		//System.out.println(Thread.currentThread().getName());

		a.start();
		
		A a1= new A();
		a1.start();

	}

}

class A extends Thread {
	public A() {
		
	}
	public A(String tName) {
		super(tName);
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " A thread name");
		System.out.println("A run method");
	}
}

class B extends Thread {
	public B() {
		Thread.currentThread().setName("Thread-B");
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " B thread name");
		System.out.println(" B run method");
	}
}
