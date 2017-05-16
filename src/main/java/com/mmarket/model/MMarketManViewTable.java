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
@Table(name="TBL_MAN_VIEW")
public class MMarketManViewTable implements Serializable { 

	private static final long serialVersionUID = 1L;

	private long viewId;
	private long manId; // foreign key
	private long eventId; // foreign key
	private Date viewDate;
	private long patronId; // foreign key
	
	private MMarketManTable manRec;
	private MMarketEventTable eventRec;
	private MMarketPatronTable patronRec;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "VIEW_ID", unique = true, nullable = false)
	public long getViewId() {
		return viewId;
	}
	public void setViewId(long viewId) {
		this.viewId = viewId;
	}
	
	@Column(name = "MAN_ID", unique = true, nullable = false)
	public long getManId() {
		return manId;
	}
	
	public void setManId(long manId) {
		this.manId = manId;
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
	@JoinColumn(name = "MAN_ID", referencedColumnName = "MAN_ID", insertable = false, updatable = false)
	public MMarketManTable getManRec() {
		return manRec;
	}
	public void setManRec(MMarketManTable man) {
		this.manRec = man;
	}
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "EVENT_ID", referencedColumnName = "EVENT_ID", insertable = false, updatable = false)
	public MMarketEventTable getEventRec() {
		return eventRec;
	}
	
	public void setEventRec(MMarketEventTable event) {
		this.eventRec = event;
	}
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "PATRON_ID", referencedColumnName = "PATRON_ID", insertable = false, updatable = false)
	public MMarketPatronTable getPatronRec() {
		return patronRec;
	}
	public void setPatronRec(MMarketPatronTable patron) {
		this.patronRec = patron;
	}
	
	
}
