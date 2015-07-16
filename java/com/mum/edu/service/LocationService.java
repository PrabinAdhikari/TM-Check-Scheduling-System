package com.mum.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.dao.ILocationDao;
import com.mum.edu.model.Location;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class LocationService implements ILocationService {
	@Autowired
	private ILocationDao locationDao;

	public LocationService() {
		super();
	}

	public ILocationDao getLocationDao() {
		return locationDao;
	}

	public void setLocationDao(ILocationDao locationDao) {
		this.locationDao = locationDao;
	}

	public void addLocation(Location location) {
		// TODO Auto-generated method stub
		locationDao.addLocation(location);

	}

	public List<Location> getAllLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Location findLocationByLocationname(String locationname) {
		// TODO Auto-generated method stub
		return null;
	}

}
