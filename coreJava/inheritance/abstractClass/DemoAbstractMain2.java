package com.fifth;

public class DemoAbstractMain2 {

	public static void main(String[] args) {
		// can not create object of any abstract class
		// AbstractClass2 obj = new AbstractClass2();
		AbstractClass2 obj = new  Complete4() ;
		
		Complete3 obj2= new Complete4() ;
		// used for :- 
		AbstractClass2 obj3= new AbstractClass2() {
			@Override
			void doWork() {
				System.out.println("use of abstract class and anonymous class");
			}
		};
		obj3.show();
		obj3.doWork();
	}

}

abstract class AbstractClass2 {
	public AbstractClass2() {
	}

	public void show() {
		System.out.println("Show method from AbstractClass1 called");
	}

	abstract void doWork();
}

 abstract class Complete3 extends AbstractClass2 {

	public void show() {
		System.out.println("Show method from Complete1 called");
	}
}

class Complete4 extends Complete3 {

	public void show() {
		System.out.println("Show method from Complete1 called");
	}
	
	void doWork() {
		//System.out.println("Complete method doWork()");
	}
}
class xyz{}

class A extends xyz {
	
	public void execute() {
		AbstractClass2 obj = new AbstractClass2() { // anonymous class - A$1.class
			void doWork() { }
		};
		obj.show();
	}
}