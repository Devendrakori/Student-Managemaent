package com.sept10;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Student;

public class AllStudent {
	public static void main(String[] args) {
		Student s1=new Student(01,"Devendra",88,"Katni");
		Student s2=new Student(02,"Raj",98,"Pune");
		Student s3=new Student(03,"Kunal",78,"Nashik");
		Student s4=new Student(04,"Amit",80,"Nagpur");
		Student s5=new Student(05,"Anubhav",50,"Jabalpur");
		
		List<Student> l1=new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		
		
		
		
		
		
		
		
		
		
//		System.out.println(l1);
		for(Student s:l1)
		{
			System.out.println(s.getName());
		}
	}

}
