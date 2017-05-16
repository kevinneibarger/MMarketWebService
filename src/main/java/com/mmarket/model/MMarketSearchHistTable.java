/**
 * 
 */
package com.mmarket.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author kevin
 *
 */
public class MMarketSearchHistTable implements Serializable { 

	private static final long serialVersionUID = 1L;

	private long searchId;
	private long patronId; // foreign key
	private long eventId; // foreign key
	private long manId; // foreign key
	
	private MMarketPatronTable patron;
	private MMarketEventTable event;
	private MMarketManTable man;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "SEARCH_ID", unique = true, nullable = false)
	public long getSearchId() {
		return searchId;
	}
	
	public void setSearchId(long searchId) {
		this.searchId = searchId;
	}
	
	@Column(name = "PATRON_ID", unique = true, nullable = false)
	public long getPatronId() {
		return patronId;
	}
	public void setPatronId(long patronId) {
		this.patronId = patronId;
	}
	
	@Column(name = "EVENT_ID", unique = true, nullable = false)
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	
	@Column(name = "MAN_ID", unique = true, nullable = false)
	public long getManId() {
		return manId;
	}
	public void setManId(long manId) {
		this.manId = manId;
	}
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "PATRON_ID", referencedColumnName = "PATRON_ID", insertable = false, updatable = false)
	public MMarketPatronTable getPatron() {
		return patron;
	}
	public void setPatron(MMarketPatronTable patron) {
		this.patron = patron;
	}
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "EVENT_ID", referencedColumnName = "EVENT_ID", insertable = false, updatable = false)
	public MMarketEventTable getEvent() {
		return event;
	}
	public void setEvent(MMarketEventTable event) {
		this.event = event;
	}
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "MAN_ID", referencedColumnName = "MAN_ID", insertable = false, updatable = false)
	public MMarketManTable getMan() {
		return man;
	}
	public void setMan(MMarketManTable man) {
		this.man = man;
	}
	
	
}
