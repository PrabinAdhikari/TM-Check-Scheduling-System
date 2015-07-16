/**
 * 
 */
package com.mum.edu.dao;

import java.util.List;

import com.mum.edu.model.User;

/**
 * @author Prabin
 *
 */
public interface IUserDao {
	public User findStudent(long userId);

	public void updateUser(User user);
	public void addUser(User user);

	public void deleteUser(long userId);

	public List<User> getAllUsers();
	
	public User findUserByUsername(String username);
}
