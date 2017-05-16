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
import com.mmarket.dao.impl.MMarketAttendedTableDAOImpl;
import com.mmarket.dao.impl.MMarketEventTableDAOImpl;
import com.mmarket.dao.impl.MMarketManTableDAOImpl;
import com.mmarket.dao.impl.MMarketManViewTableDAOImpl;
import com.mmarket.dao.impl.MMarketPatronTableDAOImpl;
import com.mmarket.dao.impl.MMarketSearchHistTableDAOImpl;
import com.mmarket.model.MMarketAttendedTable;
import com.mmarket.model.MMarketEventTable;
import com.mmarket.model.MMarketManTable;
import com.mmarket.model.MMarketManViewTable;
import com.mmarket.model.MMarketPatronLoginHistTable;
import com.mmarket.model.MMarketPatronTable;
import com.mmarket.model.MMarketSearchHistTable;

/**
 * @author kevin
 *
 */

@Service("mmarketService")
public class MMarketService {

	@Autowired
	MMarketManViewTableDAOImpl manViewedDAO;
	
	@Autowired
	MMPatronLoginHistDAOImpl patronLoginHistDAO;
	
	@Autowired
	MMarketAttendedTableDAOImpl attendedDAO;
	
	@Autowired
	MMarketEventTableDAOImpl eventDAO;
	
	@Autowired
	MMarketManTableDAOImpl manDAO;
	
	@Autowired
	MMarketPatronTableDAOImpl patronDAO;
	
	@Autowired
	MMarketSearchHistTableDAOImpl searchHistDAO;
	
	/**
	 * Services for Man Market Patron Login History Table
	 *
	 */
	
	@Transactional
	public List<MMarketPatronLoginHistTable> getAllPatronLoginHist() {
		return patronLoginHistDAO.getAllPatronsLoginHist();
	}
	
	@Transactional
	public MMarketPatronLoginHistTable getPatronLoginHistByPatronId(long patronId) {
		return patronLoginHistDAO.getPatronLoginHistByPatronId(patronId);
	}
	
	@Transactional
	public MMarketPatronLoginHistTable getPatronLoginHistByHistId(long histId) {
		return patronLoginHistDAO.getPatronLoginHistByHistId(histId);
	}
	
	@Transactional
	public List<MMarketPatronLoginHistTable> getPatronLoginHistByDateRange(Date startDate, Date endDate) {
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
	
	/**
	 * Services for Man Market Viewed Table
	 *
	 */

	@Transactional
	public List<MMarketManViewTable> getAllMenViewed() {
		return manViewedDAO.getAllViews();
	}
	
	@Transactional
	public MMarketManViewTable getManViewedById(long viewId) {
		return manViewedDAO.getManViewedById(viewId);
	}
	
	@Transactional
	public List<MMarketManViewTable> getManViewedByEventId(long eventId) {
		return manViewedDAO.getManViewedByEventId(eventId);
	}
	
	@Transactional
	public List<MMarketManViewTable> getManViewedByViewDate(Date viewDate) {
		return manViewedDAO.getManViewedByViewDate(viewDate);
	}

	@Transactional	public List<MMarketManViewTable> getManViewedByPatronId(long patronId) {
		return manViewedDAO.getManViewedByPatronId(patronId);
	}

	/**
	 * Services for Man Market Attended Table
	 *
	 */
	
	public List<MMarketAttendedTable> getAllAttendees() {
		return attendedDAO.getAllAttendees();
	}


	public List<MMarketAttendedTable> getAttendeesEventById(long eventId) {
		return attendedDAO.getAttendeesEventById(eventId);
	}

	public List<MMarketAttendedTable> getAttendeesByViewDate(Date viewDate) {
		return attendedDAO.getAttendeesByViewDate(viewDate);
	}

	
	public MMarketAttendedTable getAttendedByPatronId(long patronId) {
		return attendedDAO.getAttendedByPatronId(patronId);
	}
	
	/**
	 * Services for Man Market Event Table
	 *
	 */
	
	public List<MMarketEventTable> getAllEvents() {
		return eventDAO.getAllEvents();
	}


	public List<MMarketEventTable> getAllEventsByName(String eventName) {
		return eventDAO.getAllEventsByName(eventName);
	}

	public List<MMarketEventTable> getAllEventsByVenue(String venueName) {
		return eventDAO.getAllEventsByVenue(venueName);
	}

	public MMarketEventTable getEventById(long eventId) {
		return eventDAO.getEventById(eventId);
	}

	public List<MMarketEventTable> getEventsByEventCity(String eventCity) {
		return eventDAO.getEventsByEventCity(eventCity);
	}

	public List<MMarketEventTable> getEventsByVenueCity(String venueCity) {
		return eventDAO.getEventsByVenueCity(venueCity);
	}

	public List<MMarketEventTable> getEventsByEventStatus(String eventStatus) {
		return eventDAO.getEventsByEventStatus(eventStatus);
	}
	
	/**
	 * Services for Man Market Man Table
	 *
	 */
	
	public List<MMarketManTable> getAllData() {
		return manDAO.getAllData();
	}

	public MMarketManTable getManById(long manId) {
		return manDAO.getManById(manId);
	}

	public List<MMarketManTable> getMenByEventId(long eventId) {
		return manDAO.getMenByEventId(eventId);
	}

	public List<MMarketManTable> getMenByOccupation(String occupation) {
		return manDAO.getMenByOccupation(occupation);
	}

	public List<MMarketManTable> getMenByAge(String age) {
		return manDAO.getMenByAge(age);
	}

	public List<MMarketManTable> getMenByAgeRange(String startAge, String endAge) {
		return manDAO.getMenByAgeRange(startAge, endAge);
	}

	public List<MMarketManTable> getMenByEthnicity(String ethnicity) {
		return manDAO.getMenByEthnicity(ethnicity);
	}

	public List<MMarketManTable> getMenByEthnicityRange(List<String> ethnicities) {
		return manDAO.getMenByEthnicityRange(ethnicities);
	}

	public List<MMarketManTable> getMenByHeightRange(String shortest, String tallest) {
		return manDAO.getMenByHeightRange(shortest, tallest);
	}

	public List<MMarketManTable> getMenByEventNum(long eventNum) {
		return manDAO.getMenByEventNum(eventNum);
	}

	public List<MMarketManTable> getMenByFirstName(String firstName) {
		return manDAO.getMenByFirstName(firstName);
	}
	
	/**
	 * Services for Man Market Patron
	 *
	 */
	
	public List<MMarketPatronTable> getAllPatrons() {
		return patronDAO.getAllPatrons();
	}

	public MMarketPatronTable getPatronById(long id) {
		return patronDAO.getPatronById(id);
	}

	public MMarketPatronTable getPatronByName(String firstName, String lastName) {
		return patronDAO.getPatronByName(firstName, lastName);
	}

	public MMarketPatronTable getPatronByBirthYear(String birthYear) {
		return patronDAO.getPatronByBirthYear(birthYear);
	}

	public List<MMarketPatronTable> getPatronsByCreateDate(Date createDate) {
		return patronDAO.getPatronsByCreateDate(createDate);
	}

	public List<MMarketPatronTable> getPatronsByGender(String gender) {
		return patronDAO.getPatronsByGender(gender);
	}
	
	/**
	 * Services for Man Market Search History Table
	 *
	 */
	
	public MMarketSearchHistTable getSearchHistById(long id) {
		return searchHistDAO.getSearchHistById(id); 
	}

	public List<MMarketSearchHistTable> getAllSearchHistory() {
		return searchHistDAO.getAllSearchHistory();
	}

	public List<MMarketSearchHistTable> getSearchHistoryByManId(long manId) {
		return searchHistDAO.getSearchHistoryByManId(manId);
	}

	public List<MMarketSearchHistTable> getSearchHistoryByEventId(long eventId) {
		return searchHistDAO.getSearchHistoryByEventId(eventId);
	}

	public List<MMarketSearchHistTable> getSearchHistoryByPatronId(long patronId) {
		return searchHistDAO.getSearchHistoryByPatronId(patronId);
	}
}
