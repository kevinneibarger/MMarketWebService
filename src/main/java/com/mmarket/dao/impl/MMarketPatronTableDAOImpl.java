/**
 * 
 */
package com.mmarket.dao.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.MMarketPatronTableDAO;
import com.mmarket.model.MMarketManViewTable;
import com.mmarket.model.MMarketPatronLoginHistTable;
import com.mmarket.model.MMarketPatronTable;

/**
 * @author kevin
 *
 */
@Repository
public class MMarketPatronTableDAOImpl implements MMarketPatronTableDAO {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	public SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getAllPatrons()
	 */
	@Override
	public List<MMarketPatronTable> getAllPatrons() {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketPatronTable> allPatrons = template.loadAll(MMarketPatronTable.class);
		return allPatrons;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronById(long)
	 */
	@Override
	public MMarketPatronTable getPatronById(long id) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		MMarketPatronTable patron = new MMarketPatronTable();
		
		List l = template.find("from MMarketPatronTable where patronId = ?", id);
		if (l != null && l.size() > 0) {
			patron = (MMarketPatronTable)l.get(0);
		}
		
		return patron;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronByName(java.lang.String, java.lang.String)
	 */
	@Override
	public MMarketPatronTable getPatronByName(String firstName, String lastName) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		DetachedCriteria criteria = DetachedCriteria.forClass(MMarketPatronTable.class);
		criteria.add(Restrictions.and(
				Restrictions.eq("firstName", firstName), Restrictions.eq("lastName", lastName)));
		
		List l = template.findByCriteria(criteria);
		MMarketPatronTable patron = new MMarketPatronTable();
		
		if (l != null && l.size() > 0) {
			patron = (MMarketPatronTable) l.get(0);
		}
		
		return patron;
		
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronByBirthYear(java.lang.String)
	 */
	@Override
	public List<MMarketPatronTable> getPatronByBirthYear(String birthYear) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketPatronTable> getPatronByBY = 
				(List<MMarketPatronTable>)template.find("from MMarketPatronTable where birthYear=?", birthYear);
		
		return getPatronByBY;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronsByCreateDate(java.sql.Date)
	 */
	@Override
	public List<MMarketPatronTable> getPatronsByCreateDate(Date createDate) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketPatronTable> patronsByCreateDate =
				(List<MMarketPatronTable>)template.find("from MMarketPatronTable where createDate=?", createDate);
		
		return patronsByCreateDate;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketPatronTableDAO#getPatronsByGender(java.lang.String)
	 */
	@Override
	public List<MMarketPatronTable> getPatronsByGender(String gender) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketPatronTable> patronsByGender =
				(List<MMarketPatronTable>)template.find("from MMarketPatronTable where gender=?", gender);
		
		return patronsByGender;
	}

	@Override
	public boolean checkPatronExistence(String email, String password, String birthYear) {

		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		DetachedCriteria criteria = DetachedCriteria.forClass(MMarketPatronTable.class);
		criteria.add(Restrictions.and(
				Restrictions.eq("emailAddr", email), Restrictions.eq("password", password), Restrictions.eq("birthYear", birthYear)));
		
		List l = template.findByCriteria(criteria);

		if (l != null && l.size() > 0) {
			return true;
		}
		
		
		return false;
	}

	@Override
	public MMarketPatronTable loginPatron(String email, String password) {

		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		DetachedCriteria criteria = DetachedCriteria.forClass(MMarketPatronTable.class);
		criteria.add(Restrictions.and(
				Restrictions.eq("emailAddr", email), Restrictions.eq("password", password)));
		
		List l = template.findByCriteria(criteria);
		MMarketPatronTable patron = new MMarketPatronTable();
		
		if (l != null && l.size() > 0) {
			patron = (MMarketPatronTable) l.get(0);
		}
		
		return patron;
	}

	@Override
	public int addPatron(MMarketPatronTable patron) {
		
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		template.saveOrUpdate(patron);
		
		// Check and make sure it was added!
		MMarketPatronTable newPatron =  getPatronById(patron.getPatronId());
		
		if (newPatron != null) {
			return 1;
		} else {
			return 0;
		}
	}

}
