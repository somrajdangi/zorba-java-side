package com.second;

public class WrapperInteger {
	
	public static void main(String[] args) {
		int i =10, j =100;
		Integer intObj1=1000;
		Integer intNum= i;
		
		// int num = 1000;
		//Integer intObj1 = new Integer(num);
		Integer intObj = new Integer(i);
		System.out.println("Un-Boxing"+intObj.intValue()); // Un-boxing
		System.out.println("Add two wrapper obj "+(intObj1-intObj));
		int num = intObj; 
		System.out.println("after unboxing "+num); // Auto -Unboxing
		System.out.println(intObj.toString());
		System.out.println(intObj1.toString());
		
		System.out.println(intObj.getClass().getName() + "@" + Integer.toHexString(intObj.hashCode()));
		System.out.println(intObj1.getClass().getName() + "@" + Integer.toHexString(intObj1.hashCode()));
		
		System.out.println(intObj1);
		System.out.println(intObj1.floatValue());
		System.out.println(Integer.max(i, j));
		
//		Integer intObj2 = new Integer("1000");
		
		Integer i1= 10;
		Integer i2=20;
		System.out.println(i1+i2);
		
		
		String strNum ="1000-";
		System.out.println("Is String type"+strNum instanceof String);
		//System.out.println("Is Integer type"+strNum instanceof Integer);
		try {
			int intNumber = Integer.parseInt(strNum);
			System.out.println(intNumber);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("String passed have some non-numeric char");
		}
		
		
	}
	
	

}
/*
 * parseInt("ABC")=> 0
 * parseInt(0) => 0
public static int parseInt(String s) throws NumberFormatException {
try{
        return parseInt(s,10);}
        
    }catch (NFE e ){ return 0;}
*/
// Boxing , Un-Boxing
// Auto-Boxing , Auto-Unboxing