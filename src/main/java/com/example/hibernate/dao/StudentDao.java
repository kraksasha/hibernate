package com.example.hibernate.dao;

import com.example.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDao {
    private SessionFactory sessionFactory;

    public StudentDao(){
        sessionFactory = new Configuration().configure()
                .addAnnotatedClass(Student.class).buildSessionFactory();
    }

    public void addStudent(Student student){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }

    public List<Student> findAll(){
        Session session = sessionFactory.openSession();
        Query<Student> query = session.createQuery("from Student", Student.class);
        return query.list();
    }

    public void deleteById(Long id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.delete(student);
        transaction.commit();
    }

    public Student findById(Long id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, id);
        transaction.commit();
        return student;
    }

    public void updateStudent(Student student){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
    }



}
