package com.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private int rollNO,total;
	private String name;
	
	public Student() {
	}
	
	public Student(int rollNO,int total,String name)
	{
		super();
		this.rollNO=rollNO;
		this.total=total;
		this.name=name;

	}

	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", total=" + total + ", name=" + name + "]";
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
