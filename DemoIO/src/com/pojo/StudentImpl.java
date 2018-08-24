package com.pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentImpl implements StudentFileIO, StudentIO {

	Scanner s=new Scanner(System.in);
	@Override
	public Student[] readFromUser() {
		Student[] stu=new Student[5];
		for(int i=0;i<5;i++) {
		System.out.println("enter name:");
		String name=s.next();
		System.out.println("enter roll number:");
		int rollNO=s.nextInt();
		System.out.println("enter total:");
		int total=s.nextInt();
		Student st=new Student(rollNO,total,name);
		stu[i]=st;
		}
		// TODO Auto-generated method stub
		return stu;
	}

	@Override
	public void writeToUser(Student[] students) {
		// TODO Auto-generated method stub
		int len=students.length;
		for(int i=0;i<len;i++)
		{
			System.out.println("name:"+students[i].getName()+"\t roll no:"+students[i].getRollNO()+"\t total:"+students[i].getTotal());
				
	}
	}
	@Override
	public Student[] readStudents() {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi=new FileInputStream("student.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Object obj=oi.readObject();
			Student[] student=(Student[])obj;
			return student;
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public int writeStudents(Student[] students) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo=new FileOutputStream("student.txt");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(students);
			oo.close();
			fo.close();
			
			System.out.println("operation completed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
