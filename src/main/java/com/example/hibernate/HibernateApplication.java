package com.example.hibernate;

import com.example.hibernate.dao.StudentDao;
import com.example.hibernate.entity.Student;
import com.example.hibernate.manager.StudentManager;

import java.util.List;

public class HibernateApplication {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(3L);
		student.setName("Jon");
		student.setAge(38);
		StudentDao studentDao = new StudentDao();
		StudentManager studentManager = new StudentManager(studentDao);
//		studentManager.addNewStudent(student);
//		List<Student> listStudent = studentManager.findAllStudents();
//		for (int i = 0; i < listStudent.size(); i++){
//			System.out.println(listStudent.get(i).getName() + " " + listStudent.get(i).getAge());
//		}
//		studentManager.deleteStudentById(2L);
//		studentManager.updateOldStudent(student);
//		System.out.println(studentManager.findStudentById(2L).getName());
	}

}
