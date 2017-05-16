/**
 * 
 */
package com.mmarket.dao;

import java.sql.Date;
import java.util.List;

import com.mmarket.model.MMarketPatronLoginHistTable;

/**
 * @author kevin
 *
 */
public interface MMPatronLoginHistDAO {

	public List<MMarketPatronLoginHistTable> getAllPatronsLoginHist(); 
	public MMarketPatronLoginHistTable getPatronLoginHistByPatronId(long patronId);
	public MMarketPatronLoginHistTable getPatronLoginHistByHistId(long histId);
	public List<MMarketPatronLoginHistTable> getPatronLoginHistByDateRange(Date startDate, Date endDate);
	public int updatePatronById(long patronId, Date lastLoginDate);
	public int addPatronLoginHist(long patronId, Date lastLoginDate);
	public int deleteLoginHistByPatronId(long patronId); 
}
