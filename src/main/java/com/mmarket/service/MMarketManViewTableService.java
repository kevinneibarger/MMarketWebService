/**
 * 
 */
package com.mmarket.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mmarket.dao.impl.MMarketManViewTableDAOImpl;
import com.mmarket.model.MMarketManViewTable;

/**
 * @author kevin
 *
 */

@Service("mmManViewedTableService")
public class MMarketManViewTableService { 
	
	@Autowired
	MMarketManViewTableDAOImpl mmManViewTable;

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
