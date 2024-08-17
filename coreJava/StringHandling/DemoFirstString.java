package com.first;

public class DemoFirstString {

	public static void main(String[] args) {
		// string literals
		String str = "Welcome";
		System.out.println(str.toString());
		System.out.println(str.getClass().getName() + "@" + Integer.toHexString(str.hashCode()));
		//immutable => Can not be changed.
		System.out.println("********************");
		str = str +" to java class";
		System.out.println(str.getClass().getName() + "@" + Integer.toHexString(str.hashCode()));
		
		String str1 = new String(str); // 123 => 456 (where string value is stored , i.e string pool)
		System.out.println(str1.getClass().getName() + "@" + Integer.toHexString(str1.hashCode()));
		
	}

}
