package com.second;

import java.util.Scanner;

public class DemoScanner2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		String firstNum = sc.nextLine();
		System.out.println("Enter Second Number");
		String secondNum = sc.nextLine();
		System.out.println(firstNum+"  "+secondNum);
		// + , - , * ,/
		// 10/3 => 3.333333

	}

}
