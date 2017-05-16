/**
 * 
 */
package com.mmarket.dao;

import java.util.List;

import com.mmarket.model.MMarketEventTable;

/**
 * @author kevin
 *
 */
public interface MMarketEventTableDAO {

	public List<MMarketEventTable> getAllEvents(); 
	public List<MMarketEventTable> getAllEventsByName(String eventName);
	public List<MMarketEventTable> getAllEventsByVenue(String venueName);
	public MMarketEventTable getEventById(long eventId);
	public List<MMarketEventTable> getEventsByEventCity(String eventCity);
	public List<MMarketEventTable> getEventsByVenueCity(String venueCity);
	public List<MMarketEventTable> getEventsByEventStatus(String eventStatus);
	
}
