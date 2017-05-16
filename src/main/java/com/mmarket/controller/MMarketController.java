/**
 * 
 */
package com.mmarket.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mmarket.model.MMPatronLoginHistory;
import com.mmarket.service.MMPatronLoginHistService;

/**
 * @author kevin
 *
 */

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class MMarketController { 

	@Autowired
	MMPatronLoginHistService patronLoginHistService;
	
	@RequestMapping(value = "/getAllPatronLoginHist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MMPatronLoginHistory> getAllPatronLoginHist() {
		
		List<MMPatronLoginHistory> allPatrons = patronLoginHistService.getAllPatronLoginHist();
		return allPatrons;
	}
	
	@RequestMapping(value = "/getPatronLoginHistByPatronId/{patronId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public MMPatronLoginHistory getPatronLoginHistByPatronId(@PathVariable long patronId) {
		
		MMPatronLoginHistory patron = patronLoginHistService.getPatronLoginHistByPatronId(patronId);
		return patron;
	}
	
	@RequestMapping(value = "/getPatronLoginHistByHistId/{histId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public MMPatronLoginHistory getPatronLoginHistByHistId(@PathVariable long histId) {
		
		MMPatronLoginHistory patron = patronLoginHistService.getPatronLoginHistByHistId(histId);
		return patron;
	}
	
	@RequestMapping(value = "/getPatronLoginHistByDateRange/{startDate}/{endDate}", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MMPatronLoginHistory> getPatronLoginHistByDateRange(@PathVariable("startDate") Date startDate, @PathVariable("endDate") Date endDate) {
		
		List<MMPatronLoginHistory> allPatrons = patronLoginHistService.getPatronLoginHistByDateRange(startDate, endDate);
		return allPatrons;
	}
	
	@RequestMapping(value = "/updatePatronById/{patronId}/{lastLoginDate}", method = RequestMethod.POST, headers = "Accept=html/text")
	public String updatePatronById(@PathVariable long patronId, @PathVariable Date lastLoginDate) {
		
		int success = patronLoginHistService.updatePatronById(patronId, lastLoginDate);

		if (success == 1) {
			return "Patron with ID: "+patronId+" Was Successfully Updated!";
		} else {
			return "Patron with ID: "+patronId+" Was NOT Updated!";
		}
	}
	
	@RequestMapping(value = "/addPatronLoginHistRec/{patronId}/{lastLoginDate}", method = RequestMethod.PUT, headers = "Accept=html/text")
	public String addNewPatronLoginHistRec(@PathVariable long patronId, @PathVariable Date lastLoginDate) {
		
		int success = patronLoginHistService.addPatronLoginHist(patronId, lastLoginDate);

		if (success == 1) {
			return "Patron with ID: "+patronId+" Was Successfully ADDED!";
		} else {
			return "Patron with ID: "+patronId+" Was NOT ADDED, an error hath occurreth!";
		}
	}
}
