package com.thread.first;

public class DemoThread {

	public static void main(String[] args) {
		
		WorkThread thread = new WorkThread(); // new state
		WorkThreadA thread1 = new WorkThreadA();
		
		thread.start(); // enters into execution 
		thread1.start(); 
		
		
	}
}

class WorkThread extends Thread {
	
	public WorkThread() {
		System.out.println("WorkThread ");
	}
	
	@Override
	public void run() {
		for(int i =0 ; i< 5 ;i++) {
			System.out.println("WorkThread Run method called "+i);
		}
	}
	
}
class WorkThreadA extends Thread {
	
	public WorkThreadA() {
		System.out.println("WorkThread ");
	}
	
	@Override
	public void run() {
		for(int i =0 ; i< 5 ;i++) {
			System.out.println("WorkThreadA Run method called "+i);
		}
	}
	
}
