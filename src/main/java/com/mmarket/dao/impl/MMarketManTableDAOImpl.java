/**
 * 
 */
package com.mmarket.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.MMarketManTableDAO;
import com.mmarket.model.MMarketManTable;

/**
 * @author kevin
 *
 */
@Repository
public class MMarketManTableDAOImpl implements MMarketManTableDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getAllData()
	 */
	@Override
	public List<MMarketManTable> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getManById(long)
	 */
	@Override
	public MMarketManTable getManById(long manId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEventId(long)
	 */
	@Override
	public List<MMarketManTable> getMenByEventId(long eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByOccupation(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByOccupation(String occupation) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByAge(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByAge(String age) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByAgeRange(java.lang.String, java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByAgeRange(String startAge, String endAge) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEthnicity(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByEthnicity(String ethnicity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEthnicityRange(java.util.List)
	 */
	@Override
	public List<MMarketManTable> getMenByEthnicityRange(List<String> ethnicities) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByHeightRange(java.lang.String, java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByHeightRange(String shortest, String tallest) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEventNum(long)
	 */
	@Override
	public List<MMarketManTable> getMenByEventNum(long eventNum) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByFirstName(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
