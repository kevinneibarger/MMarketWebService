/**
 * 
 */
package com.mmarket.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
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
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.loadAll(MMarketEventTable.class);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getAllEventsByName(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getAllEventsByName(String eventName) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.find("from MMarketEventTable where eventName = ?", eventName);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getAllEventsByVenue(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getAllEventsByVenue(String venueName) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.find("from MMarketEventTable where venueName = ?", venueName);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventById(long)
	 */
	@Override
	public MMarketEventTable getEventById(long eventId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List l = template.find("from MMarketEventTable where eventId = ?", eventId);
		MMarketEventTable event = new MMarketEventTable();
		
		if (l != null && l.size() > 0) {
			event = (MMarketEventTable)l.get(0);
		}
		
		return event;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventsByEventCity(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getEventsByEventCity(String eventCity) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.find("from MMarketEventTable where eventCity = ?", eventCity);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventsByVenueCity(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getEventsByVenueCity(String venueCity) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.find("from MMarketEventTable where venueCity = ?", venueCity);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketEventTableDAO#getEventsByEventStatus(java.lang.String)
	 */
	@Override
	public List<MMarketEventTable> getEventsByEventStatus(String eventStatus) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.find("from MMarketEventTable where eventStatus = ?", eventStatus);
	}

	@Override
	public List<MMarketEventTable> getEventsByZipCode(String zipCode) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.find("from MMarketEventTable where venueZipCode = ?", zipCode);
	}

	@Override
	public List<MMarketEventTable> getEventsByCity(String city) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketEventTable>) template.find("from MMarketEventTable where eventCity = ?", city);
	}

}
