package com.first;

import java.util.Scanner;

public class StringMethods2 {

	public static void main(String[] args) {
		String str = " Welcome to JAVA CLASS ";
		str=str.trim();
		System.out.println(str);
		String st[]= str.split(" ");
		System.out.println(st.length);
		for(String s : st)
			System.out.println(s);
		String st1[]=str.split(" ", 2);
		System.out.println(st1.length);
		for(String s : st1)
			System.out.println(s);
		
		// subString
		String subStr1 = str.substring(6);
		System.out.println(subStr1);
		
		String subStr2 = str.substring(6 , 10);
		System.out.println(subStr2);
		
		String strReplaced = str.replace("JAVA", "ZORBA");
		System.out.println(strReplaced);
		System.out.println(str);
		String strReplaced1 = str.replaceAll(" ", "-");
		System.out.println(strReplaced1);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		int x=0;
		do {
			x=x*10+num%10;
			num=num/10;
		}while(num>0);
		System.out.println(x);
	}

}
/*split
substring
replace
*/