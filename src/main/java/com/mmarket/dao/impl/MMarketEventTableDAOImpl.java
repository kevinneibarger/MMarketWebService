/**
 * 
 */
package com.mmarket.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.MMarketEventTableDAO;
import com.mmarket.model.MMarketEventTable;

/**
 * @author kevin
 *
 */
@Repository
public class MMarketEventTableDAOImpl implements MMarketEventTableDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getAllEvents()
	 */
	@Override
	public List<MMarketEventTable> getAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getAllEventsByName(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getAllEventsByName(String eventName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getAllEventsByVenue(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getAllEventsByVenue(String venueName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventById(long)
	 */
	@Override
	public MMarketEventTable getEventById(long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventsByEventCity(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getEventsByEventCity(String eventCity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventsByVenueCity(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getEventsByVenueCity(String venueCity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventsByEventStatus(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getEventsByEventStatus(String eventStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
