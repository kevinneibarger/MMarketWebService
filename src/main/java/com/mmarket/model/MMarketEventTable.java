/**
 * 
 */
package com.mmarket.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kevin
 *
 */

@Entity
@Table(name="TBL_EVENT")
public class MMarketEventTable implements Serializable { 

	private static final long serialVersionUID = 1L;
	
	private long eventId;
	private String eventName;
	private String venueName;
	private String venueAddress;
	private String venueCity;
	private String venueState;
	private String venueZipCode;
	private Date eventStartMen;
	private Date eventStartPatron;
	private Date eventDate;
	private String eventStatus;
	private double patronCost;
	private double manCost;
	private String eventCity;
	private String eventState;
	private String eventPasscode;
	private String question1;
	private String question2;
	private String question3;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EVENT_ID", unique = true, nullable = false)
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	
	@Column(name = "EVENT_NAME", unique = true, nullable = false, length = 75)
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	@Column(name = "VENUE_NAME", unique = true, nullable = false, length = 75)
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	
	@Column(name = "VENUE_ADDRESS", unique = true, nullable = false, length = 75)
	public String getVenueAddress() {
		return venueAddress;
	}
	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}
	
	@Column(name = "VENUE_CITY", unique = true, nullable = false, length = 75)
	public String getVenueCity() {
		return venueCity;
	}
	public void setVenueCity(String venueCity) {
		this.venueCity = venueCity;
	}
	
	@Column(name = "VENUE_STATE", unique = true, nullable = false, length = 75)
	public String getVenueState() {
		return venueState;
	}
	public void setVenueState(String venueState) {
		this.venueState = venueState;
	}
	
	@Column(name = "VENUE_ZIP_CODE", unique = true, nullable = false, length = 75)
	public String getVenueZipCode() {
		return venueZipCode;
	}
	public void setVenueZipCode(String venueZipCode) {
		this.venueZipCode = venueZipCode;
	}
	
	@Column(name = "EVENT_START_MEN", unique = true, nullable = false)
	public Date getEventStartMen() {
		return eventStartMen;
	}
	public void setEventStartMen(Date eventStartMen) {
		this.eventStartMen = eventStartMen;
	}
	
	@Column(name = "EVENT_START_PATRON", unique = true, nullable = false)
	public Date getEventStartPatron() {
		return eventStartPatron;
	}
	public void setEventStartPatron(Date eventStartPatron) {
		this.eventStartPatron = eventStartPatron;
	}
	
	@Column(name = "EVENT_DATE", unique = true, nullable = false)
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	
	@Column(name = "EVENT_STATUS", unique = true, nullable = false, length = 75)
	public String getEventStatus() {
		return eventStatus;
	}
	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}
	
	@Column(name = "PATRON_COST", unique = true, nullable = false)
	public double getPatronCost() {
		return patronCost;
	}
	public void setPatronCost(double patronCost) {
		this.patronCost = patronCost;
	}
	
	@Column(name = "MAN_COST", unique = true, nullable = false)
	public double getManCost() {
		return manCost;
	}
	public void setManCost(double manCost) {
		this.manCost = manCost;
	}
	
	@Column(name = "EVENT_CITY", unique = true, nullable = false, length = 75)
	public String getEventCity() {
		return eventCity;
	}
	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}
	
	@Column(name = "EVENT_STATE", unique = true, nullable = false, length = 2)
	public String getEventState() {
		return eventState;
	}
	public void setEventState(String eventState) {
		this.eventState = eventState;
	}
	
	@Column(name = "EVENT_PASSCODE", unique = true, nullable = false, length = 25)
	public String getEventPasscode() {
		return eventPasscode;
	}
	public void setEventPasscode(String eventPasscode) {
		this.eventPasscode = eventPasscode;
	}
	
	@Column(name = "QUESTION_1", unique = true, nullable = false, length = 100)
	public String getQuestion1() {
		return question1;
	}
	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	
	@Column(name = "QUESTION_2", unique = true, nullable = false, length = 100)
	public String getQuestion2() {
		return question2;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	
	@Column(name = "QUESTION_3", unique = true, nullable = false, length = 100)
	public String getQuestion3() {
		return question3;
	}
	public void setQuestion3(String question3) {
		this.question3 = question3;
	}
	
}
