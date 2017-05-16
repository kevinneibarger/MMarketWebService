/**
 * 
 */
package com.mmarket.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mmarket.dao.impl.MMPatronLoginHistDAOImpl;
import com.mmarket.model.MMPatronLoginHistory;

/**
 * @author kevin
 *
 */
@Service("mmPatronLoginHistService")
public class MMPatronLoginHistService {
	
	@Autowired
	MMPatronLoginHistDAOImpl patronLoginHistDAO;
	
	@Transactional
	public List<MMPatronLoginHistory> getAllPatronLoginHist() {
		return patronLoginHistDAO.getAllPatronsLoginHist();
	}
	
	@Transactional
	public MMPatronLoginHistory getPatronLoginHistByPatronId(long patronId) {
		return patronLoginHistDAO.getPatronLoginHistByPatronId(patronId);
	}
	
	@Transactional
	public MMPatronLoginHistory getPatronLoginHistByHistId(long histId) {
		return patronLoginHistDAO.getPatronLoginHistByHistId(histId);
	}
	
	@Transactional
	public List<MMPatronLoginHistory> getPatronLoginHistByDateRange(Date startDate, Date endDate) {
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
}
