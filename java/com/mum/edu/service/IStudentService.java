/**
 * 
 */
package com.mum.edu.service;

import java.util.List;

import com.mum.edu.model.Student;

/**
 * @author Prabin
 *
 */
public interface IStudentService {
	public void addStudent(Student student);
	public List<Student> getAllStudent();
	 public Student findStudent(long studentId);
	 public Student findStudentByUserId(long userId);
}
