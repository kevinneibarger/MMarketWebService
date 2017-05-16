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
@Table(name="TBL_PATRON")
public class MMarketPatronTable implements Serializable { 

	private static final long serialVersionUID = 1L;

	private long patronId;
	private String firstName;
	private String lastName;
	private String emailAddr;
	private String password;
	private String gender;
	private String birthYear;
	private Date createDate;
	private Date lastLogin;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PATRON_ID", unique = true, nullable = false)
	public long getPatronId() {
		return patronId;
	}
	public void setPatronId(long patronId) {
		this.patronId = patronId;
	}
	
	@Column(name = "FIRST_NM", unique = true, nullable = false, length=50)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name = "LAST_NM", unique = true, nullable = false, length=50)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "EMAIL_ADDR", unique = true, nullable = false, length=50)
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	
	@Column(name = "PASSWORD", unique = true, nullable = false, length=50)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "GENDER", unique = true, nullable = false, length=25)
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Column(name = "BIRTHYEAR", unique = true, nullable = false)
	public String getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	
	@Column(name = "CREATE_DATE", unique = true, nullable = false)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Column(name = "LAST_LOGIN", unique = true, nullable = false)
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	
}
