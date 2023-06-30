package com.example.hibernate.manager;

import com.example.hibernate.dao.StudentDao;
import com.example.hibernate.entity.Student;

import java.util.List;

public class StudentManager {
    private StudentDao studentDao;

    public StudentManager(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addNewStudent(Student student){
        studentDao.addStudent(student);
    }

    public List<Student> findAllStudents(){
        return studentDao.findAll();
    }

    public void deleteStudentById(Long id){
        studentDao.deleteById(id);
    }

    public Student findStudentById(Long id){
        return studentDao.findById(id);
    }

    public void updateOldStudent(Student student){
        studentDao.updateStudent(student);
    }

}
