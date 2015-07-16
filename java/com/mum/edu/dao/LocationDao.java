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

import com.mum.edu.model.Location;

/**
 * @author Prabin
 *
 */

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class LocationDao implements ILocationDao {
	@Autowired
	private SessionFactory sf;
	
//	public void setSessionFactory(SessionFactory sf) {
//		this.sf = sf;
//	}

	public Location findLocation(long userId) {
		 return (Location)sf.getCurrentSession().get(Location.class, userId);
	}
	public Location findLocation(String uid){
		 return (Location)sf.getCurrentSession().get(Location.class, uid);
	}

	public void updateLocation(Location location) {
		// TODO Auto-generated method stub
		location  = (Location) sf.getCurrentSession().merge(location);
	}

	public void deleteLocation(long locationId) {
		// TODO Auto-generated method stub
		Location loc=findLocation(locationId);
        sf.getCurrentSession().delete(loc);
		
	}

	public List<Location> getAllLocation() {
		// TODO Auto-generated method stub
		Query q = (Query) sf.getCurrentSession().createQuery("from Location loc");
        return q.list();
	}
	

	public void addLocation(Location location) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().persist(location);
		
	}
	public Location findStudent(long locationId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
