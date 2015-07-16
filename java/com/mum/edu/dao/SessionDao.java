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

import com.mum.edu.model.Session;

/**
 * @author Prabin
 *
 */

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class SessionDao implements ISessionDao {
	@Autowired
	private SessionFactory sf;
	
//	public void setSessionFactory(SessionFactory sf) {
//		this.sf = sf;
//	}

	public Session findSession(long userId) {
		 return (Session)sf.getCurrentSession().get(Session.class, userId);
	}
	public Session findSession(String uid){
		 return (Session)sf.getCurrentSession().get(Session.class, uid);
	}

	public void updateSession(Session session) {
		// TODO Auto-generated method stub
		session  = (Session) sf.getCurrentSession().merge(session);
	}

	public void deleteSession(long sessionId) {
		// TODO Auto-generated method stub
		Session loc=findSession(sessionId);
        sf.getCurrentSession().delete(loc);
		
	}

	public List<Session> getAllSession() {
		// TODO Auto-generated method stub
		Query q = (Query) sf.getCurrentSession().createQuery("from Session loc");
        return q.list();
	}
	

	public void addSession(Session session) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().persist(session);
		
	}
	public Session findStudent(long sessionId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Session> getAllSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
