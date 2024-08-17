package com.thread.first;

public class DemoRunnable {

	public static void main(String[] args) {
		ThreadRunnable threadRunnable = new ThreadRunnable();
		
		Thread threadA = new Thread(threadRunnable,"Thread-A");
		Thread threadB = new Thread(threadRunnable,"Thread-B");
		
		threadA.start();
		threadB.start();
		System.out.println("End of Main thread");
		
	}

}
class ThreadRunnable implements Runnable{
	@Override
	public void run() {
		for(int i =0 ; i<5; i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName()+" Execution for "+i);
		}
	}
	
}
/* start(){

this.run();
}
*/