/**
 * 
 */
package com.mum.edu.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import com.mum.edu.model.Student;

/**
 * @author Prabin
 *
 */

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class StudentDao implements IStudentDao {
	@Autowired
	private SessionFactory sf;
	
//	public void setSessionFactory(SessionFactory sf) {
//		this.sf = sf;
//	}

	public Student findStudent(long studentId) {
		 return (Student)sf.getCurrentSession().get(Student.class, studentId);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		student  = (Student) sf.getCurrentSession().merge(student);
	}

	public void deleteStudent(long studentId) {
		// TODO Auto-generated method stub
		Student st=findStudent(studentId);
        sf.getCurrentSession().delete(st);
		
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		Query q = (Query) sf.getCurrentSession().createQuery("from Student st");
        return q.list();
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().persist(student);
		
	}
	

}
