/**
 * 
 */
package com.mmarket.dao.impl;

import java.sql.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.MMarketPatronTableDAO;
import com.mmarket.model.MMarketPatronTable;

/**
 * @author kevin
 *
 */
@Repository
public class MMarketPatronTableDAOImpl implements MMarketPatronTableDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getAllPatrons()
	 */
	@Override
	public List<MMarketPatronTable> getAllPatrons() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronById(long)
	 */
	@Override
	public MMarketPatronTable getPatronById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronByName(java.lang.String, java.lang.String)
	 */
	@Override
	public MMarketPatronTable getPatronByName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronByBirthYear(java.lang.String)
	 */
	@Override
	public MMarketPatronTable getPatronByBirthYear(String birthYear) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronsByCreateDate(java.sql.Date)
	 */
	@Override
	public List<MMarketPatronTable> getPatronsByCreateDate(Date createDate) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronsByGender(java.lang.String)
	 */
	@Override
	public List<MMarketPatronTable> getPatronsByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

}
