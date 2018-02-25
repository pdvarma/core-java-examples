package com.apex.main;

import java.util.Scanner;


abstract class Shape{ // no object
	public String color;
	
	public Shape() {
		color = "black";
	}
	
	public Shape(String color) {
		this.color = color;
	}
	abstract public double area(); // functionality
	
	
}


class Circle extends Shape{
	int radius;
	Circle(){
		super();
	}
	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * 5 * radius;
	}	
}

class Square extends Shape{
	public double area() {
		return 10 * 10;
	}	
}



public class AbstractDemo {
	Shape shape;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 1 for Circle 2 for Square");
		Shape shape;
		int option = input.nextInt();
		if(option == 1) {
			shape = new Circle(2,"Pink");
		}else {
			shape = new Square();
		}
		System.out.println("Area :" + shape.area());
		System.out.println("Color :" + shape.color);
		input.close();	
	}

}
