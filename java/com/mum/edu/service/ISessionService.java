/**
 * 
 */
package com.mum.edu.service;

import java.util.List;

import com.mum.edu.model.Session;

/**
 * @author Prabin
 *
 */
public interface ISessionService {
	public void addSession(Session session);
	public List<Session> getAllSessions();
	
}
