/**
 * 
 */
package com.mum.edu.dao;

import java.util.List;

import com.mum.edu.model.Student;

/**
 * @author Prabin
 *
 */
public interface IStudentDao {
	public Student findStudent(long studentId);

	public void updateStudent(Student student);
	public void addStudent(Student student);

	public void deleteStudent(long studentId);

	public List<Student> getAllStudent();
	
	public Student findStudentByUserId(long userId);
}
