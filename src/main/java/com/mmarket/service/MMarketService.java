/**
 * 
 */
package com.mmarket.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mmarket.dao.impl.MMPatronLoginHistDAOImpl;
import com.mmarket.dao.impl.MMarketManViewTableDAOImpl;
import com.mmarket.model.MMarketManViewTable;
import com.mmarket.model.MMarketPatronLoginHistTable;

/**
 * @author kevin
 *
 */

@Service("mmarketService")
public class MMarketService {

	@Autowired
	MMarketManViewTableDAOImpl mmManViewTable;
	@Autowired
	MMPatronLoginHistDAOImpl patronLoginHistDAO;
	
	@Transactional
	public List<MMarketPatronLoginHistTable> getAllPatronLoginHist() {
		return patronLoginHistDAO.getAllPatronsLoginHist();
	}
	
	@Transactional
	public MMarketPatronLoginHistTable getPatronLoginHistByPatronId(long patronId) {
		return patronLoginHistDAO.getPatronLoginHistByPatronId(patronId);
	}
	
	@Transactional
	public MMarketPatronLoginHistTable getPatronLoginHistByHistId(long histId) {
		return patronLoginHistDAO.getPatronLoginHistByHistId(histId);
	}
	
	@Transactional
	public List<MMarketPatronLoginHistTable> getPatronLoginHistByDateRange(Date startDate, Date endDate) {
		return patronLoginHistDAO.getPatronLoginHistByDateRange(startDate, endDate);
	}
	
	@Transactional
	public int updatePatronById(long patronId, Date lastLoginDate) {
		return patronLoginHistDAO.updatePatronById(patronId, lastLoginDate);
	}
	
	@Transactional
	public int addPatronLoginHist(long patronId, Date lastLoginDate) {
		return patronLoginHistDAO.addPatronLoginHist(patronId, lastLoginDate);
	}
	
	@Transactional
	public int deleteLoginHistByPatronId(long patronId) {
		return patronLoginHistDAO.deleteLoginHistByPatronId(patronId);
	}

	@Transactional
	public List<MMarketManViewTable> getAllMenViewed() {
		return mmManViewTable.getAllViews();
	}
	
	@Transactional
	public MMarketManViewTable getManViewedById(long viewId) {
		return mmManViewTable.getManViewedById(viewId);
	}
	
	@Transactional
	public List<MMarketManViewTable> getManViewedByEventId(long eventId) {
		return mmManViewTable.getManViewedByEventId(eventId);
	}
	
	@Transactional
	public List<MMarketManViewTable> getManViewedByViewDate(Timestamp viewDate) {
		return mmManViewTable.getManViewedByViewDate(viewDate);
	}

	@Transactional	public List<MMarketManViewTable> getManViewedByPatronId(long patronId) {
		return mmManViewTable.getManViewedByPatronId(patronId);
	}

}
