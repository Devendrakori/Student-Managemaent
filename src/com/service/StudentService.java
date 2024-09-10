package com.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.Entity.Student;
import com.dao.StudentDao;

public class StudentService {

	Scanner obj=new Scanner(System.in);
	StudentDao sd = null;

	public List<Student> getOneStudentService() {
		
		sd = new StudentDao();
		List<Student> l1 = sd.getOneStudent();
		return l1;
	}

	public List<Student> getAllStudentService() {
		sd = new StudentDao();
		int n=0;
		try {
		System.out.print("How many student's detail do you want to store : ");
		n = obj.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data...");
		}
		List<Student> l1 = sd.getAllStudent(n);
		return l1;
	}

	public List<Student> getStudentNameStartWithService(String ch) {
		sd = new StudentDao();
		int n=0;
		try {
		System.out.print("How many student's detail do you want to store : ");
		n = obj.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data...");
		}
		List<Student> l1 = sd.getAllStudent(n);
		List<Student> l2 = new ArrayList<Student>();
		for (Student s : l1) {
			if (s.getName().startsWith(ch)) {
				l2.add(s);
			}
		}
		return l2;
	}
	
	public List<Student> getStudentsByCityNameService(String ch) {
		sd = new StudentDao();
		int n=0;
		try {
		System.out.print("How many student's detail do you want to store : ");
		n = obj.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data...");
		}
		List<Student> l1 = sd.getAllStudent(n);
		List<Student> l2 = new ArrayList<Student>();
		for (Student s : l1) {
			if (s.getAdd().equals(ch)) {
				l2.add(s);
			}
		}
		return l2;
	}

	public List<Student> sortStudentsByRollService()
	{
		sd=new StudentDao();
		int n=0;
		try {
		System.out.print("How many student's detail do you want to store : ");
		n = obj.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data...");
		}
		List<Student> l1 = sd.getAllStudent(n);
		List<Student> l2=new ArrayList<Student>();
		l2=l1;
		Collections.sort(l2);
		return l2;
	}
	public List<Student> sortStudentsByRollInDecsService()
	{
		sd=new StudentDao();
		int n=0;
		try {
		System.out.print("How many student's detail do you want to store : ");
		n = obj.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data...");
		}
		List<Student> l1 = sd.getAllStudent(n);
		List<Student> l2=new ArrayList<Student>();
		l2=l1;
		Student temp=null;
//		Collections.sort(l2);
		for(int i=0;i<l2.size();i++)
		{
			for(int j=i+1;j<l2.size();j++)
			{
				if(l2.get(i).getRoll()<l2.get(j).getRoll())
				{
					temp=l2.get(j);
					l2.set(j, l2.get(i));
					l2.set(i, temp);
				}
			}
		}
		return l2;
	}
	public List<Student> showMinMarksService()
	{
		sd = new StudentDao();
		int n=0;
		try {
		System.out.print("How many student's detail do you want to store : ");
		n = obj.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data...");
		}
		
		List<Student> l1=sd.getAllStudent(n);
		List<Student> l2=new ArrayList<Student>();
		Student s=l1.get(0);
		int min=l1.get(0).getMarks();
		for(int i=1;i<l1.size();i++)
		{
			if(l1.get(i).getMarks()<min)
			{
				min=l1.get(i).getMarks();
				s=l1.get(i);
			}
		}
		l2.add(s);
		return l2;
	}
	
	public List<Student> showMaxMarksService()
	{
		sd = new StudentDao();
		int n=0;
		try {
		System.out.print("How many student's detail do you want to store : ");
		n = obj.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("Enter valid data...");
		}
		
		List<Student> l1=sd.getAllStudent(n);
		List<Student> l2=new ArrayList<Student>();
		Student s=l1.get(0);
		int max=l1.get(0).getMarks();
		for(int i=1;i<l1.size();i++)
		{
			if(l1.get(i).getMarks()>max)
			{
				max=l1.get(i).getMarks();
				s=l1.get(i);
			}
		}
		l2.add(s);
		return l2;
	}

}
