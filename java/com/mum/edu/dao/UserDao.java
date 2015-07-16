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

import com.mum.edu.model.User;

/**
 * @author Prabin
 *
 */

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class UserDao implements IUserDao {
	@Autowired
	private SessionFactory sf;
	
//	public void setSessionFactory(SessionFactory sf) {
//		this.sf = sf;
//	}

	public User findUser(long userId) {
		 return (User)sf.getCurrentSession().get(User.class, userId);
	}
	public User findUser(String uid){
		 return (User)sf.getCurrentSession().get(User.class, uid);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		user  = (User) sf.getCurrentSession().merge(user);
	}

	public void deleteUser(long userId) {
		// TODO Auto-generated method stub
		User st=findUser(userId);
        sf.getCurrentSession().delete(st);
		
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Query q = (Query) sf.getCurrentSession().createQuery("from User usr");
        return q.list();
	}
	

	public void addUser(User user) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().persist(user);
		
	}
	public User findStudent(long userId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		Query query = (Query) sf.getCurrentSession().createQuery("from User usr where usr.username = :username ");
	    query.setParameter("username", username);
//	    System.out.println(((User) query.uniqueResult()).toString());
	    return (User) query.uniqueResult();
	}
	

}
