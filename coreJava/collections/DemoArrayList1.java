package com.arrayList;

import java.util.ArrayList;

public class DemoArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> stringList= new ArrayList();
		System.out.println(stringList.size());
//		System.out.println(stringList.);
		stringList.add("A");
		stringList.add("Z");
		stringList.add("B");
		stringList.add("A");
		stringList.add("1");
		stringList.add("AA");
		
		for(int i =0 ; i<stringList.size() ; i++) {
			System.out.println(stringList.get(i));
		}
		
		
		System.out.println("Actual "+stringList);
		stringList.add(3, "JAVA");
		System.out.println("After addition "+stringList);
		stringList.remove(3);
		System.out.println("After deletion "+stringList);
		stringList.remove("AA");
		System.out.println("After deletion of A "+stringList);
		
		for(String str : stringList) {
			System.out.println(str);
		}
		
		String []str = new String[5]; // 50000
		str[0]="A";
		str[1]="Z";
		str[2]="B";
		str[3]="A";
		str[4]="1";
		
		for(int i=0;i<str.length ;i++) {
			System.out.println(str[i]);
			str[2]="AAAAAAAAAAAAA";
		}
		
		

	}

}
