package com.mum.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.dao.IStudentDao;
import com.mum.edu.model.Student;

@Service 
@Transactional (propagation=Propagation.REQUIRES_NEW)
public class StudentService implements IStudentService {
	@Autowired
	private IStudentDao studentDao;
	

//	public StudentService(IStudentDao studentDao) {
//		this.studentDao = studentDao;
//	}

	public StudentService() {
		super();
	}

	public IStudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.addStudent(student);

	}

	 public List<Student> getAllStudent() {
	 // TODO Auto-generated method stub
	 return studentDao.getAllStudent();
	 }
	
	 public Student findStudent(long studentId){
	 return studentDao.findStudent(studentId);
	 }

	public Student findStudentByUserId(long userId) {
		// TODO Auto-generated method stub
		return studentDao.findStudentByUserId(userId);
	}

	

}
