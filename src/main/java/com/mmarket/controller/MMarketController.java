/**
 * 
 */
package com.mmarket.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mmarket.model.MMarketAttendedTable;
import com.mmarket.model.MMarketEventTable;
import com.mmarket.model.MMarketManTable;
import com.mmarket.model.MMarketManViewTable;
import com.mmarket.model.MMarketPatronLoginHistTable;
import com.mmarket.model.MMarketPatronTable;
import com.mmarket.service.MMarketService;

/**
 * @author kevin
 *
 */

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class MMarketController {

	/**
	 * Web Services for the Man Market - Man Viewed Table
	 */
	@Autowired
	MMarketService mmarketService;
	
	@RequestMapping(value = "/getAllPeopleViewed", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getAllPeopleViewed() {
		return mmarketService.getAllMenViewed();
	}
	
	@RequestMapping(value = "/getManViewedById/{viewId}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public MMarketManViewTable getManViewedById(@PathVariable long viewId) {
		return mmarketService.getManViewedById(viewId);
	}
	
	@RequestMapping(value = "/getManViewedByEventId/{eventId}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getManViewedByEventId(@PathVariable long eventId) {
		return mmarketService.getManViewedByEventId(eventId);
	}
	
	@RequestMapping(value = "/getManViewedByViewDate/{viewDate}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getManViewedByViewDate(@PathVariable Date viewDate) {
		return mmarketService.getManViewedByViewDate(viewDate);
	}
	
	@RequestMapping(value = "/getAllViewedByPatron/{patronId}", method = RequestMethod.GET, headers = "Accept=application/json") 
	public List<MMarketManViewTable> getAllPeopleViewed(@PathVariable long patronId) {
		return mmarketService.getManViewedByPatronId(patronId);
	}
	
	/**
	 * Web Services for the Patron Login History Table
	 */
	
	@RequestMapping(value = "/getAllPatronLoginHist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MMarketPatronLoginHistTable> getAllPatronLoginHist() {
		
		List<MMarketPatronLoginHistTable> allPatrons = mmarketService.getAllPatronLoginHist();
		return allPatrons;
	}
	
	@RequestMapping(value = "/getPatronLoginHistByPatronId/{patronId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public MMarketPatronLoginHistTable getPatronLoginHistByPatronId(@PathVariable long patronId) {
		
		MMarketPatronLoginHistTable patron = mmarketService.getPatronLoginHistByPatronId(patronId);
		return patron;
	}
	
	@RequestMapping(value = "/getPatronLoginHistByHistId/{histId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public MMarketPatronLoginHistTable getPatronLoginHistByHistId(@PathVariable long histId) {
		
		MMarketPatronLoginHistTable patron = mmarketService.getPatronLoginHistByHistId(histId);
		return patron;
	}
	
	@RequestMapping(value = "/getPatronLoginHistByDateRange/{startDate}/{endDate}", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MMarketPatronLoginHistTable> getPatronLoginHistByDateRange(@PathVariable("startDate") Date startDate, @PathVariable("endDate") Date endDate) {
		
		List<MMarketPatronLoginHistTable> allPatrons = mmarketService.getPatronLoginHistByDateRange(startDate, endDate);
		return allPatrons;
	}
	
	@RequestMapping(value = "/updatePatronById/{patronId}/{lastLoginDate}", method = RequestMethod.POST, headers = "Accept=html/text")
	public String updatePatronById(@PathVariable long patronId, @PathVariable Date lastLoginDate) {
		
		int success = mmarketService.updatePatronById(patronId, lastLoginDate);

		if (success == 1) {
			return "Patron with ID: "+patronId+" Was Successfully Updated!";
		} else {
			return "Patron with ID: "+patronId+" Was NOT Updated!";
		}
	}
	
	@RequestMapping(value = "/addPatronLoginHistRec/{patronId}/{lastLoginDate}", method = RequestMethod.PUT, headers = "Accept=html/text")
	public String addNewPatronLoginHistRec(@PathVariable long patronId, @PathVariable Date lastLoginDate) {
		
		int success = mmarketService.addPatronLoginHist(patronId, lastLoginDate);

		if (success == 1) {
			return "Patron with ID: "+patronId+" Was Successfully ADDED!";
		} else {
			return "Patron with ID: "+patronId+" Was NOT ADDED, an error hath occurreth!";
		}
	}
	
	/**
	 * Web Services for the Attended Table
	 */
	
	@RequestMapping(value = "/getAllAttendees", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketAttendedTable> getAllAttendees() {
		return mmarketService.getAllAttendees();
	}
	
	@RequestMapping(value = "/getAttendeesEventById/{eventId}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketAttendedTable> getAttendeesEventById(@PathVariable long eventId) {
		return mmarketService.getAttendeesEventById(eventId);
	}
	
	@RequestMapping(value = "/getAttendeesByViewDate/{viewDate}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketAttendedTable> getAttendeesByViewDate(@PathVariable Date viewDate) {
		return mmarketService.getAttendeesByViewDate(viewDate);
	}
	
	@RequestMapping(value = "/getAttendedByPatronId/{patronId}", method=RequestMethod.GET, headers="Accept=application/json")
	public MMarketAttendedTable getAttendedByPatronId(@PathVariable long patronId) {
		return mmarketService.getAttendedByPatronId(patronId);
	}

	/**
	 * Web Services for the Event Table
	 */
	
	@RequestMapping(value = "/getAllEvents", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketEventTable> getAllEvents() {
		return mmarketService.getAllEvents();
	}
	
	@RequestMapping(value = "/getEventById", method=RequestMethod.GET, headers="Accept=application/json")
	public MMarketEventTable getEventById(@PathVariable long eventId) {
		return mmarketService.getEventById(eventId);
	}
	
	@RequestMapping(value = "/getAllEventsByName", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketEventTable> getAllEventsByName(@PathVariable String eventName) {
		return mmarketService.getAllEventsByName(eventName);
	}
	
	@RequestMapping(value = "/getAllEventsByVenue/{venueName}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketEventTable> getAllEventsByVenue(@PathVariable String venueName) {
		return mmarketService.getAllEventsByVenue(venueName);
	}
	
	@RequestMapping(value = "/getEventsByVenueCity/{venueCityName}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketEventTable> getEventsByVenueCity(@PathVariable String venueCityName) {
		return mmarketService.getEventsByVenueCity(venueCityName);
	}
	
	@RequestMapping(value = "/getEventsByEventCity/{eventCityName}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketEventTable> getEventsByEventCity(@PathVariable String eventCityName) {
		return mmarketService.getEventsByEventCity(eventCityName);
	}
	
	@RequestMapping(value = "/getEventsByZipCode/{zipCode}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketEventTable> getEventsByZipCode(@PathVariable String zipCode) {
		return mmarketService.getEventsByZipCode(zipCode);
	}
	
	@RequestMapping(value = "/getEventsByCity/{city}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketEventTable> getEventsByCity(@PathVariable String city) {
		return mmarketService.getEventsByCity(city);
	}
	
	/**
	 * Web Services for the Man Table
	 */
	
	@RequestMapping(value = "/getAllData", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getAllData() {
		return mmarketService.getAllData();
	}
	
	@RequestMapping(value = "/getManById/{manId}", method=RequestMethod.GET, headers="Accept=application/json")
	public MMarketManTable getManById(@PathVariable long manId) {
		return mmarketService.getManById(manId);
	}
	
	@RequestMapping(value = "/getMenByEventId/{eventId}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByEventId(@PathVariable long eventId) {
		return getMenByEventId(eventId);
	}
	
	@RequestMapping(value = "/getMenByOccupation/{occupation}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByOccupation(@PathVariable String occupation) {
		return mmarketService.getMenByOccupation(occupation);
	}
	
	@RequestMapping(value = "/getMenByAge/{age}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByAge(@PathVariable String age) {
		return mmarketService.getMenByAge(age);
	}
	
	@RequestMapping(value = "/getMenByAgeRange/{startAge}/{endAge}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByAgeRange(@PathVariable String startAge, @PathVariable String endAge) {
		return mmarketService.getMenByAgeRange(startAge, endAge);
	}
	
	@RequestMapping(value = "/getMenByEthnicity/{ethnicity}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByEthnicity(@PathVariable String ethnicity) {
		return mmarketService.getMenByEthnicity(ethnicity);
	}
	
	@RequestMapping(value = "/getMenByEthnicityRange/{ethnicities}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByEthnicityRange(@PathVariable String ethnicities) {
		List<String> ethnicityList = new ArrayList<String>();
		String[] eList = ethnicities.split(",");
		
		for (int i = 0; i < eList.length; i++) {
			ethnicityList.add(eList[i]);
		}
		return mmarketService.getMenByEthnicityRange(ethnicityList);
	}
	
	@RequestMapping(value = "/getMenByHeightRange/{shortest}/{tallest}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByHeightRange(@PathVariable String shortest, @PathVariable String tallest) {
		return mmarketService.getMenByHeightRange(shortest, tallest);
	}
	
	@RequestMapping(value = "/getMenByEventNum/{eventNum}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByEventNum(@PathVariable long eventNum) {
		return mmarketService.getMenByEventNum(eventNum);
	}
	
	@RequestMapping(value = "/getMenByFirstName/{firstName}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketManTable> getMenByFirstName(@PathVariable String firstName) {
		return mmarketService.getMenByFirstName(firstName);
	}
	
//	@RequestMapping(value = "/loginMan/{email}/{password}", method=RequestMethod.GET, headers="Accept=application/json")
//	public MMarketManTable loginMan(@PathVariable String email, @PathVariable String password) {
//		return mmarketService.loginMan(email, password);
//	}
	
	@RequestMapping(value = "/registerMan/{eventId}/{eventNum}/{firstName}/{lastName}/{emailAddr}/{occupation}/{age}/{ethnicity}/{height}/{photoURL}/{regStatus}/{answer1}/{answer2}/{answer3}", method = RequestMethod.PUT, headers = "Accept=html/text") 
	public String addMan(@PathVariable int eventId, @PathVariable long eventNum, @PathVariable String firstName, @PathVariable String lastName, @PathVariable String emailAddr, @PathVariable String occupation, @PathVariable String age, 
			@PathVariable String ethnicity, @PathVariable String height, @PathVariable String photoURL, @PathVariable String regStatus, @PathVariable String answer1, 
			@PathVariable String answer2, @PathVariable String answer3) {
		
		MMarketManTable man = new MMarketManTable();
		man.setAge(new Integer(age).intValue());
		man.setFirstName(firstName);
		man.setLastName(lastName);
		man.setEmailAddr(emailAddr);
		man.setOccupation(occupation);
		man.setEthnicity(ethnicity);
		man.setHeight(height);
		man.setPhotoUrl(photoURL);
		man.setRegStatus(regStatus);
		man.setAnswer1(answer1);
		man.setAnswer2(answer2);
		man.setAnswer3(answer3);
		man.setEventId(eventId);
		man.setEventNum(eventNum);
		
		int success = mmarketService.addMan(man);

		if (success == 1) {
			return "Man with ID: "+man.getManId()+" Was Successfully ADDED!";
		} else {
			return "Man with ID: "+man.getManId()+" Was NOT ADDED, an error hath occurreth!";
		}
	}
	
	/**
	 * Web Services for Man Market Patron
	 *
	 */
	
	@RequestMapping(value = "/getAllPatrons", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketPatronTable> getAllPatrons() {
		return mmarketService.getAllPatrons();
	}

	@RequestMapping(value = "/getPatronById/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public MMarketPatronTable getPatronById(@PathVariable long id) {
		return mmarketService.getPatronById(id);
	}

	@RequestMapping(value = "/getPatronByName/{firstName}/{lastName}", method=RequestMethod.GET, headers="Accept=application/json")
	public MMarketPatronTable getPatronByName(@PathVariable String firstName, @PathVariable String lastName) {
		return mmarketService.getPatronByName(firstName, lastName);
	}

	@RequestMapping(value = "/getPatronByBirthYear/{birthYear}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketPatronTable> getPatronByBirthYear(@PathVariable String birthYear) {
		return mmarketService.getPatronByBirthYear(birthYear);
	}

	@RequestMapping(value = "/getPatronsByCreateDate/{createDate}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketPatronTable> getPatronsByCreateDate(@PathVariable Date createDate) {
		return mmarketService.getPatronsByCreateDate(createDate);
	}

	@RequestMapping(value = "/getPatronsByGender/{gender}", method=RequestMethod.GET, headers="Accept=application/json")
	public List<MMarketPatronTable> getPatronsByGender(@PathVariable String gender) {
		return mmarketService.getPatronsByGender(gender);
	}
	
	@RequestMapping(value = "/doesPatronExist/{email}/{password}/{birthYear}", method=RequestMethod.GET, headers="Accept=application/json")
	public String doesPatronExist(@PathVariable String email, @PathVariable String password, @PathVariable String birthYear) {
		boolean doesExist = mmarketService.doesPatronExist(email, password, birthYear);
		
		if (doesExist) {
			return "1";
		} else {
			return "0";
		}
	}

	@RequestMapping(value = "/loginPatron/{email}/{password}", method=RequestMethod.GET, headers="Accept=application/json")
	public MMarketPatronTable loginPatron(@PathVariable String email, @PathVariable String password) {
		return mmarketService.loginPatron(email, password);
	}
	
	@RequestMapping(value = "/addPatron/{firstName}/{lastName}/{emailAddr}/{password}/{gender}/{birthYear}", method = RequestMethod.PUT, headers = "Accept=html/text") 
	public String addPatron(@PathVariable String firstName, @PathVariable String lastName, @PathVariable String emailAddr, @PathVariable String password, @PathVariable String gender, 
			@PathVariable String birthYear) {
		
		MMarketPatronTable patron = new MMarketPatronTable();
		patron.setBirthYear(birthYear);
		patron.setEmailAddr(emailAddr);
		patron.setFirstName(firstName);
		patron.setLastName(lastName);
		patron.setGender(gender);
		patron.setPassword(password);
		patron.setCreateDate(new Date(System.currentTimeMillis()));
		
		int success = mmarketService.addPatron(patron);

		if (success == 1) {
			return "Patron with ID: "+patron.getPatronId()+" Was Successfully ADDED!";
		} else {
			return "Patron with ID: "+patron.getPatronId()+" Was NOT ADDED, an error hath occurreth!";
		}
	}
}
