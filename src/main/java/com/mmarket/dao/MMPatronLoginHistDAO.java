/**
 * 
 */
package com.mmarket.dao;

import java.sql.Date;
import java.util.List;

import com.mmarket.model.MMPatronLoginHistory;

/**
 * @author kevin
 *
 */
public interface MMPatronLoginHistDAO {

	public List<MMPatronLoginHistory> getAllPatronsLoginHist();
	public MMPatronLoginHistory getPatronLoginHistByPatronId(long patronId);
	public MMPatronLoginHistory getPatronLoginHistByHistId(long histId);
	public List<MMPatronLoginHistory> getPatronLoginHistByDateRange(Date startDate, Date endDate);
	public int updatePatronById(long patronId, Date lastLoginDate);
	public int addPatronLoginHist(long patronId, Date lastLoginDate);
	public int deleteLoginHistByPatronId(long patronId);
}
