/**
 * 
 */
package com.mmarket.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mmarket.model.MMarketManViewTable;
import com.mmarket.model.MMarketPatronLoginHistTable;
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
	public List<MMarketManViewTable> getManViewedByViewDate(@PathVariable Timestamp viewDate) {
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

}
