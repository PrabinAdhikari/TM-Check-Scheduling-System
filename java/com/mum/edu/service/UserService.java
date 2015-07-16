package com.mum.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.dao.IUserDao;
import com.mum.edu.model.User;

@Service 
@Transactional (propagation=Propagation.REQUIRES_NEW)
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
	
	public UserService() {
		super();
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setStudentDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);

	}

	 public List<User> getAllStudent() {
	 // TODO Auto-generated method stub
		 return userDao.getAllUsers();
	 }
	


	 public User findUser(long uid){
		 return userDao.findStudent(uid);
		 }


	public void addStudent(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.findUserByUsername(username);
	}

}
