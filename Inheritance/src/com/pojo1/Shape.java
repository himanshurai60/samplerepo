package com.pojo1;

public class Shape {

	private String name;
	public Shape() {
		name="no name";
		
	}
	
	public Shape(String name) {
		super();
		this.name=name;
	}

	public void description()
	{
		System.out.println("name:"+name);
	}
	public double area();
}
