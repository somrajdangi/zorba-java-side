package com.first;

public class DemoStringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to Java Class");
		System.out.println(sb);
		StringBuffer sb1 =sb.append(" in Zorba");
		System.out.println(sb);
		System.out.println(sb1);
		
		StringBuilder sbuil = new StringBuilder("Welcome to Java Class");
		
	}

}
