package com.first;

public class Inheritance {

	public static void main(String[] args) {
		Figure f = new Figure();
		f.showArea(); //   0
		//f.methodPrivate();
		
		Rectangle rect = new Rectangle(10, 20);
		rect.showArea();//200
		//rect.methodPrivate();
		
		Square sq = new Square(10);
		sq.showArea();//100
		
		Figure fig = new Rectangle(10, 30);
	}

}
class Figure{
	int area , l ,b;
	 Car showArea() {
		area = l*b;
		System.out.println("Area ="+area);
		return null;
	}
	private void methodPrivate() {
		
	}
}
class Rectangle extends Figure{
	//int area , l=10 ,b=20;
	public Rectangle(int l , int b) {
		this.l=l;
		this.b=b;
	}
	@Override
	public BMW showArea() {
		area = l*b;
		System.out.println("Rectangle Area ="+area);
		byte b =10;
		return null;
	}
	
}
class Square extends Figure{
	public Square(int l) {
		this.l=l;
		this.b=l;
	}
}