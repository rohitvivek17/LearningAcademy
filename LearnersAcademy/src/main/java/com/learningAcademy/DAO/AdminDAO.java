package com.learningAcademy.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learningAcademy.Entity.Student;
import com.learningAcademy.Util.HibernateUtil;

public class AdminDAO {
	 public static List<Student> getAllStudents() {
	        // Retrieve all students from the database using Hibernate
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        List<Student> studentList = session.createQuery(" FROM Student ", Student.class).list();
	        session.close();
	        return studentList;
	    }
	    
	    public static void addOrUpdateStudent(Student student) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = session.beginTransaction();
	        session.saveOrUpdate(student);
	        transaction.commit();
	        session.close();
	    }
	    
	    public static void deleteStudent(int studentId) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = session.beginTransaction();
	        Student student = session.get(Student.class, studentId);
	        if (student != null) {
	            session.delete(student);
	        }
	        transaction.commit();
	        session.close();
	    }
}
