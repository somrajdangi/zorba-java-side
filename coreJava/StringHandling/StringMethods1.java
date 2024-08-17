package com.first;

public class StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World ";
		// StringIndexOutOfBoundsException -> check length() on str and then index < length
//		char ch=str.charAt(20); 
		char ch=str.charAt(2);  // o/p -> l
		System.out.println(ch);
		int eIndx=str.indexOf('l');
		int indx = str.indexOf('l', 5);
		int lIndx= str.lastIndexOf('l');
		char [] x=str.toCharArray();
		System.out.println(str.trim());
		System.out.println(String.valueOf(Boolean.FALSE));
		String st[] = str.split("o");
		for(String s : st)
			System.out.println(s);
		System.out.println(x[6]);
		
	}
	
	public void show() {
		A aObj = new A();
		
	}

}
class A{
	void doWork() {
		
	}
}

/*
charAt
indexOf
lastindxof
tocharArray
trim -> trimming leading & trailing space
valueOf
split
substring
replace


*/