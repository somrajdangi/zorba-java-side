package com.first;

public class MemoryOnString {

	public static void main(String[] args) {
		String s1 = new String( "abc");  // 123
		String s2 = new String( "abc"); 
		
		String s3 = "abc"; // 123 
		String s4 = "abc"; // 123
		String s5= s4; // 123
		
		// 3 , 2
		
		s1= null;
		s3= null;
		s4= null;
		s5= null;
//
	}

}
