package com.second;

public class DemoSuper {

	public static void main(String[] args) {
		B b = new B(10); // 1
		b.show();
	}
}

class A {
	int i =100;
	public A(){
		System.out.println("Constructor A called"); 
	}
	public A(int i){
		System.out.println("Constructor A called value of i "+i); 
	}
	void show() {
		System.out.println("Show method from parent class A");
	}
}
class B extends A{
	int i ;
	public B(){ 
		super(10); // by default super() present in all const 
		System.out.println("Constructor B called"); //4
	}
	public B(int i){ 
		//super();
	//	this();
		this.i=i;
		System.out.println("Constructor B called value of i "+this.i); //4
		System.out.println("Value of i form parent "+super.i);
	}
	public void show() {
		System.out.println("Show method from Child class B");
		super.show();
	}
}