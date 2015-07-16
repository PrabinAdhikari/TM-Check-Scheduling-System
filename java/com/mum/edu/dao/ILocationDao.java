/**
 * 
 */
package com.mum.edu.dao;

import java.util.List;

import com.mum.edu.model.Location;

/**
 * @author Prabin
 *
 */
public interface ILocationDao {
	public Location findLocation(long locationId);

	public void updateLocation(Location location);
	public void addLocation(Location user);

	public void deleteLocation(long userId);

	public List<Location> getAllLocations();
	
}
