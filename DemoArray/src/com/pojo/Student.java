package com.pojo;

public class Student {
String name;
int[] marks;
int rollNo;

public Student()
{
	name="raju";
	marks=new int[3];
	rollNo=21;
}
public Student(String name, int[] marks, int rollNo) {
	this.name=name;
	this.marks=marks;
	this.rollNo=rollNo;
}
void display()
{
	System.out.println("name:"+name);
	for (int i : marks)
		System.out.println(i);
	System.out.println("rollnumber:"+rollNo);
	
}
}
