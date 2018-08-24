package com.myabstract;

public class Circle extends Shape {
private int radius;

	public Circle() {
		radius=10;
	}
	public Circle(int radius, String name)
	{
		super(name);
		this.radius=radius;
	}

	public double area()
	{
		return (3.14*radius*radius);
	}
}
