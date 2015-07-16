package com.mum.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.dao.ISessionDao;
import com.mum.edu.model.Session;

@Service 
@Transactional (propagation=Propagation.REQUIRES_NEW)
public class SessionService implements ISessionService {
	@Autowired
	private ISessionDao sessionDao;
	
	public SessionService() {
		super();
	}

	public ISessionDao getSessionDao() {
		return sessionDao;
	}

	public void setSessionDao(ISessionDao sessionDao) {
		this.sessionDao = sessionDao;
	}

	public void addSession(Session session) {
		// TODO Auto-generated method stub
		sessionDao.addSession(session);

	}

	public List<Session> getAllSessions() {
		// TODO Auto-generated method stub
		return null;
	}

}
