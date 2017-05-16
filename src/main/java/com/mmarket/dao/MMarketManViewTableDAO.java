/**
 * 
 */
package com.mmarket.dao;

import java.sql.Date;
import java.util.List;

import com.mmarket.model.MMarketManViewTable;

/**
 * @author kevin
 *
 */
public interface MMarketManViewTableDAO {
	
	public List<MMarketManViewTable> getAllViews();  
	public MMarketManViewTable getManViewedById(long viewId);
	public List<MMarketManViewTable> getManViewedByEventId(long eventId);
	public List<MMarketManViewTable> getManViewedByViewDate(Date viewDate);
	public List<MMarketManViewTable> getManViewedByPatronId(long patronId); 

}
