/**
 * 
 */
package com.mum.edu.service;

import java.util.List;

import com.mum.edu.model.User;

/**
 * @author Prabin
 *
 */
public interface IUserService {
	public void addStudent(User user);
	public List<User> getAllUser();
	public User findUserByUsername(String username);

}
