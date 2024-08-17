package com.thread.first;

public class DemoSleep {

	public static void main(String[] args) {
		SleepThread thread = new SleepThread("SleepThread-A");
		SleepThread thread1 = new SleepThread("SleepThread-B");

		thread.start();
		thread1.start();

	}

}

class SleepThread extends Thread {
	public SleepThread(String tName) {
		super(tName);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread execution : " + i);
			int j = (int) (Math.random() * 5);
			System.out.println(Thread.currentThread().getName());
			if (i == j) {
				System.out.println("Value of j = " + j);
				System.out.println("Sleep called");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
