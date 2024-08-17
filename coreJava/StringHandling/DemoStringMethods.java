package com.first;

public class DemoStringMethods {

	public static void main(String[] args) {
		String str = new String(); // str=""; empty string
		System.out.println("Value of str");
		System.out.println(str==null);
		str = new String("Hello World");
		
		// length
		System.out.println("Length of String is :"+str.length());
		// toUpper toLowwer
		System.out.println("Case change "+str.toUpperCase());
		System.out.println("Case change "+str.toLowerCase());
		
		System.out.println("Case change "+str);
		// str = str.toUpperCase();
		String s1 = "abc"; // 123 
		String s2 = "abc"; 
		String s3= s2; // 
		
		System.out.println("ref check "+(s1==s2));
		System.out.println("ref check 1 "+(s3==s2));
		
		String str1= new String("abc"); // 456
		
		
		System.out.println("ref check 2 "+(s1==str1));
		
		System.out.println(s1.getClass().getName() + "@" + Integer.toHexString(s1.hashCode()));
		
		System.out.println(str1.getClass().getName() + "@" + Integer.toHexString(str1.hashCode()));
		
		System.out.println("Content verfication "+(s1.equals(str1)));
		System.out.println("Content verfication "+(s1.equals(s2)));
		
		System.out.println(str1.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(str1)));
		
	}

}
