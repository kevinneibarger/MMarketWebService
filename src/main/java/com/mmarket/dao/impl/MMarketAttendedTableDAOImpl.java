/**
 * 
 */
package com.mmarket.dao.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.MMarketAttendedTableDAO;
import com.mmarket.model.MMarketAttendedTable;

/**
 * @author kevin
 *
 */
@Repository
public class MMarketAttendedTableDAOImpl implements MMarketAttendedTableDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketAttendedTableDAO#getAllAttendees()
	 */
	@Override
	public List<MMarketAttendedTable> getAllAttendees() {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return template.loadAll(MMarketAttendedTable.class);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketAttendedTableDAO#getAttendeesEventById(long)
	 */
	@Override
	public List<MMarketAttendedTable> getAttendeesEventById(long eventId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<?> l = template.find("from MMarketAttendedTable where eventId=?", eventId);
		
		List<MMarketAttendedTable> attendedList = new ArrayList<MMarketAttendedTable>();
		if (l != null && l.size() > 0) {
			for (Object rec : l) {
				attendedList.add((MMarketAttendedTable)rec);
			}
		}
		
		return attendedList;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketAttendedTableDAO#getAttendeesByViewDate(java.sql.Date)
	 */
	@Override
	public List<MMarketAttendedTable> getAttendeesByViewDate(Date viewDate) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<?> l = template.find("from MMarketAttendedTable where viewDate=?", viewDate);
		
		List<MMarketAttendedTable> attendedList = new ArrayList<MMarketAttendedTable>();
		if (l != null && l.size() > 0) {
			for (Object rec : l) {
				attendedList.add((MMarketAttendedTable)rec);
			}
		}
		
		return attendedList;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketAttendedTableDAO#getAttendedByPatronId(long)
	 */
	@Override
	public MMarketAttendedTable getAttendedByPatronId(long patronId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<?> l = template.find("from MMarketAttendedTable where patronId=?", patronId);
		
		MMarketAttendedTable attended = new MMarketAttendedTable();
		if (l != null && l.size() > 0) {
			attended = (MMarketAttendedTable)l.get(0);
		}
		
		return attended;
	}

}
