/**
 * 
 */
package com.mmarket.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.MMarketSearchHistTableDAO;
import com.mmarket.model.MMarketSearchHistTable;

/**
 * @author kevin
 *
 */

@Repository
public class MMarketSearchHistTableDAOImpl implements MMarketSearchHistTableDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketSearchHistTableDAO#getSearchHistById(long)
	 */
	@Override
	public MMarketSearchHistTable getSearchHistById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketSearchHistTableDAO#getAllSearchHistory()
	 */
	@Override
	public List<MMarketSearchHistTable> getAllSearchHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketSearchHistTableDAO#getSearchHistoryByManId(long)
	 */
	@Override
	public List<MMarketSearchHistTable> getSearchHistoryByManId(long manId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketSearchHistTableDAO#getSearchHistoryByEventId(long)
	 */
	@Override
	public List<MMarketSearchHistTable> getSearchHistoryByEventId(long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketSearchHistTableDAO#getSearchHistoryByPatronId(long)
	 */
	@Override
	public List<MMarketSearchHistTable> getSearchHistoryByPatronId(long patronId) {
		// TODO Auto-generated method stub
		return null;
	}

}
