package com.dao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.Entity.Student;

public class StudentDao {

	Scanner obj = new Scanner(System.in);

	public List<Student> getOneStudent() {
		Student s1 = null;
		try {
			System.out.print("\nEnter roll number : ");
			int roll = obj.nextInt();
			System.out.print("Enter student's name : ");
			String name = obj.next();
			System.out.print("Enter student's marks : ");
			int marks = obj.nextInt();
			System.out.print("Enter student's city name : ");
			String city = obj.next();
			s1 = new Student(roll, name, marks, city);
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data..");
		}
		List<Student> l1 = new ArrayList<Student>();
		l1.add(s1);
		return l1;
	}

	public List<Student> getAllStudent(int n) {
		List<Student> l1 = new ArrayList<Student>();
		Student s1 = null;
		try {
			for (int i = 1; i <= n; i++) {
				System.out.print("\n" + i + "). " + "Enter roll number : ");
				int roll = obj.nextInt();
				System.out.print("Enter student's name : ");
				String name=obj.next();
				System.out.print("Enter student's marks : ");
				int marks = obj.nextInt();
				System.out.print("Enter student's city name : ");
				String city=obj.next();
				System.out.println();
				s1 = new Student(roll, name, marks, city);
				l1.add(s1);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter valid data..");
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		return l1;
}
}
