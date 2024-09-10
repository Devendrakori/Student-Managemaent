package com.controller;

import java.util.List;

import com.Entity.Student;
import com.service.StudentService;

public class StudentController {
	
	StudentService service=null;
	
	public List<Student> getOneStudentControl()
	{
		service=new StudentService();
		List<Student> l1=service.getOneStudentService();
		return l1;
	}
	
	public List<Student> getAllStudentControl()
	{
		service=new StudentService();
		List<Student> l1=service.getAllStudentService();
		return l1;
	}
	public List<Student> getStudentNameStartWithControl(String ch)
	{
		service=new StudentService();
		List<Student> l1=service.getStudentNameStartWithService(ch);
		return l1;
	}
	
	public List<Student> sortStudentsByRollControl()
	{
		service=new StudentService();
		List<Student> l1=service.sortStudentsByRollService();
		return l1;
	}
	public List<Student> showMinMarksControl()
	{
		service=new StudentService();
		List<Student> l1=service.showMinMarksService();
		return l1;
	}
	public List<Student> showMaxMarksControl()
	{
		service=new StudentService();
		List<Student> l1=service.showMaxMarksService();
		return l1;
	}

}
