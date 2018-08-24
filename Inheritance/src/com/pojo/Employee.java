package com.pojo;

public class Employee extends Person {
	private double empSalary;
	private int empId;
	
	public Employee()
	{
		//super();
		empId=0;
		empSalary=1000;
	}
	
	public Employee(int empId,double empSalary,int age, String name)
	{
		super(age,name);
		this.empId=empId;
		this.empSalary=empSalary;
	}
	public void display()
	{
		System.out.println("name:"+name+"age:"+age);
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	void display()
	{
		super.display();
		System.out.println(empId+"\t"+empSalary);
	}
	
}
