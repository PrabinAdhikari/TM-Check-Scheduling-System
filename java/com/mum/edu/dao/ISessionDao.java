/**
 * 
 */
package com.mum.edu.dao;

import java.util.List;

import com.mum.edu.model.Session;

/**
 * @author Prabin
 *
 */
public interface ISessionDao {
	public Session findSession(long locationId);

	public void updateSession(Session location);
	public void addSession(Session user);

	public void deleteSession(long userId);

	public List<Session> getAllSessions();
	
}
