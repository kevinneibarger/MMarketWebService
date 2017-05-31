/**
 * 
 */
package com.mmarket.dao.impl;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mmarket.dao.MMarketManTableDAO;
import com.mmarket.model.MMarketEventTable;
import com.mmarket.model.MMarketManTable;
import com.mmarket.model.MMarketPatronLoginHistTable;
import com.mmarket.model.MMarketPatronTable;

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
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketManTable>) template.loadAll(MMarketManTable.class);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getManById(long)
	 */
	@Override
	public MMarketManTable getManById(long manId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List l = template.find("from MMarketManTable where manId = ?", manId);
		MMarketManTable man = new MMarketManTable();
		
		if (l != null && l.size() > 0) {
			man = (MMarketManTable)l.get(0);
		}
		
		return man;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEventId(long)
	 */
	@Override
	public List<MMarketManTable> getMenByEventId(long eventId) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketManTable>) template.find("from MMarketManTable where eventId = ?", eventId);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByOccupation(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByOccupation(String occupation) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketManTable>) template.find("from MMarketManTable where occupation = ?", occupation);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByAge(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByAge(String age) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketManTable>) template.find("from MMarketManTable where age = ?", age);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByAgeRange(java.lang.String, java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByAgeRange(String startAge, String endAge) {
		DetachedCriteria criteria = DetachedCriteria.forClass(MMarketManTable.class);
		criteria.add(Restrictions.between("age", startAge, endAge));
		
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketManTable> men = (List<MMarketManTable>)template.findByCriteria(criteria);
		return men;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEthnicity(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByEthnicity(String ethnicity) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketManTable>) template.find("from MMarketManTable where ethnicity = ?", ethnicity);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEthnicityRange(java.util.List)
	 */
	@Override
	public List<MMarketManTable> getMenByEthnicityRange(List<String> ethnicities) {
		DetachedCriteria criteria = DetachedCriteria.forClass(MMarketManTable.class);
		criteria.add(Restrictions.in("ethnicity", ethnicities));
		
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketManTable> men = (List<MMarketManTable>)template.findByCriteria(criteria);
		return men;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByHeightRange(java.lang.String, java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByHeightRange(String shortest, String tallest) {
		DetachedCriteria criteria = DetachedCriteria.forClass(MMarketManTable.class);
		criteria.add(Restrictions.between("height", shortest, tallest));
		
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		List<MMarketManTable> men = (List<MMarketManTable>)template.findByCriteria(criteria);
		return men;
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByEventNum(long)
	 */
	@Override
	public List<MMarketManTable> getMenByEventNum(long eventNum) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketManTable>) template.find("from MMarketManTable where eventNum = ?", eventNum);
	}

	/* (non-Javadoc)
	 * @see com.mmarket.dao.MMarketManTableDAO#getMenByFirstName(java.lang.String)
	 */
	@Override
	public List<MMarketManTable> getMenByFirstName(String firstName) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		return (List<MMarketManTable>) template.find("from MMarketManTable where firstName = ?", firstName);
	}

	@Override
	public MMarketManTable loginMan(String email, String password) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		
		DetachedCriteria criteria = DetachedCriteria.forClass(MMarketManTable.class);
		criteria.add(Restrictions.and(
				Restrictions.eq("emailAddr", email), Restrictions.eq("password", password)));
		
		List l = template.findByCriteria(criteria);
		MMarketManTable man = new MMarketManTable();
		
		if (l != null && l.size() > 0) {
			man = (MMarketManTable) l.get(0);
		}
		
		return man;
	}

	@Override
	public int addMan(MMarketManTable man) {
		HibernateTemplate template = new HibernateTemplate(this.sessionFactory);
		template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		template.saveOrUpdate(man);
		
		// Check and make sure it was added!
		MMarketManTable newMan =  getManById(man.getManId());
		
		if (newMan != null) {
			return 1;
		} else {
			return 0;
		}
	}

}
