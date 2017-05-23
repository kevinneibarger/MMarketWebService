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

import com.mmarket.dao.MMarketManViewTableDAO;
import com.mmarket.model.MMarketManViewTable;

/**
 * @author kevin
 *
 */
@Repository
public class MMarketManViewTableDAOImpl implements MMarketManViewTableDAO {
 
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<MMarketManViewTable> getAllViews() {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketManViewTable> allData = template.loadAll(MMarketManViewTable.class);
		return allData;
	}

	@Override
	public MMarketManViewTable getManViewedById(long viewId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List l = template.find("from MMarketManViewTable where viewId=?", viewId);
		MMarketManViewTable manViewed = new MMarketManViewTable();
		
		if (l != null && l.size() > 0) {
			manViewed = (MMarketManViewTable)l.get(0);
		}
		
		return manViewed;
	}

	@Override
	public List<MMarketManViewTable> getManViewedByEventId(long eventId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketManViewTable> menViewedByEvent = new ArrayList<MMarketManViewTable>();
		List l 
			= template.find("from MMarketManViewTable where eventId=?", eventId);
		
		if (l != null && l.size() > 0) {
			for (Object man : l) {
				MMarketManViewTable manViewed = (MMarketManViewTable)man;
				
				if (manViewed != null) {
					menViewedByEvent.add(manViewed);
				}
			}
		}
		
		return menViewedByEvent;
	}

	@Override
	public List<MMarketManViewTable> getManViewedByViewDate(Date viewDate) {

		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketManViewTable> menViewedByDate =
				(List<MMarketManViewTable>)template.find("from MMarketManViewTable where viewDate=?", viewDate);
		
		return menViewedByDate;
	}

	@Override
	public List<MMarketManViewTable> getManViewedByPatronId(long patronId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketManViewTable> menViewedByDate =
				(List<MMarketManViewTable>)template.find("from MMarketManViewTable where patronId=?", patronId);
		
		return menViewedByDate;
	}

}
