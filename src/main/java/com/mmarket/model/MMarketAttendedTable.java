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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author kevin
 *
 */
@Entity
@Table(name="TBL_ATTENDED")
public class MMarketAttendedTable implements Serializable { 

	private static final long serialVersionUID = 1L;
	
	private long attendId;
	private long eventId; // foreign key
	private Date viewDate;
	private long patronId; // foreign key
	
	private MMarketPatronTable patron;
	private MMarketEventTable event;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ATTEND_ID", unique = true, nullable = false)
	public long getAttendId() {
		return attendId;
	}
	public void setAttendId(long attendId) {
		this.attendId = attendId;
	}
	
	@Column(name = "EVENT_ID", unique = true, nullable = false)
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	
	@Column(name = "VIEW_DATE", unique = true, nullable = false)
	public Date getViewDate() {
		return viewDate;
	}
	public void setViewDate(Date viewDate) {
		this.viewDate = viewDate;
	}
	
	@Column(name = "PATRON_ID", unique = true, nullable = false)
	public long getPatronId() {
		return patronId;
	}
	public void setPatronId(long patronId) {
		this.patronId = patronId;
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
	
	

}
