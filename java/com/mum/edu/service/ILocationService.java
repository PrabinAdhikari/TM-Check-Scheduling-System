/**
 * 
 */
package com.mum.edu.service;

import java.util.List;

import com.mum.edu.model.Location;

/**
 * @author Prabin
 *
 */
public interface ILocationService {
	public void addLocation(Location location);
	public List<Location> getAllLocation();
	public Location findLocationByLocationname(String locationname);

}
