/**
 * 
 */
package com.mmarket.model;

import static javax.persistence.GenerationType.IDENTITY;

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
@Table(name="mm_patron_login_hist")
public class MMPatronLoginHistory {


	private long histId;
	private long patronId;
	private Date lastLoginDate;

	@Column(name = "PATRON_ID", unique = true, nullable = false)
	public long getPatronId() {
		return patronId;
	}

	public void setPatronId(long patronId) {
		this.patronId = patronId;
	}

	@Column(name = "LAST_LOGIN_DATE", unique = true, nullable = false)
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LOGIN_HIST_ID", unique = true, nullable = false)
	public long getHistId() {
		return histId;
	}

	public void setHistId(long histId) {
		this.histId = histId;
	}
}
