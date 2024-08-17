package com.second;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first umber :-");
		String first = scanner.nextLine();
//		String first = scanner.next();
		System.out.println("First entered value "+first);
		System.out.println("Type of value is String :- "+ (first instanceof String));
	}

}
