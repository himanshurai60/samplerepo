package com.pojo;

public interface StudentFileIO {
	Student[] readStudents();
	int writeStudents(Student []students);
}
