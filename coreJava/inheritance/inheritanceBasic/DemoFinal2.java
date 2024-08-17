package com.fourth;

public class DemoFinal2 {
	static {
		NAME="HAMID"; // call logic to read names based on rank
	}
	private static final String NAME;
	public static final String NAME_1="SATYA";
	{
		marks=100;
	}
	private final int marks;
	
	public static void main(String[] args) {
		DemoFinal2 obj = new DemoFinal2();
		final int marks1;
		marks1=100;
		//marks1=200; re-initialization or change on final variables
	}
	
	public void doWork(final Object obj) {
		//obj = new Object();
	}

}
