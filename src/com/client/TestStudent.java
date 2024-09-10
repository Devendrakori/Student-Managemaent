package com.client;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Student;
import com.controller.StudentController;

public class TestStudent {

	public static void main(String[] args) {
		StudentController sc = new StudentController();

		List<Student> l1 = new ArrayList<Student>();
//		l1 = sc.getAllStudentControl();
//		l1=sc.getStudentNameStartWithControl("D");
		l1=sc.sortStudentsByRollControl();
		System.out.println(l1);
	}

}
