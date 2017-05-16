/**
 * 
 */
package com.mmarket.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

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
@Table(name="TBL_MAN")
public class MMarketManTable implements Serializable { 

	private static final long serialVersionUID = 1L;

	private long manId;
	private long eventId;
	private long eventNum;
	private String firstName;
	private String lastName;
	private String emailAddr;
	private String occupation;
	private long age;
	private String ethnicity;
	private String height;
	private String photoUrl;
	private String regStatus;
	private String answer1;
	private String answer2;
	private String answer3;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
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
	
	@Column(name = "EVENT_NUM", unique = true, nullable = false)
	public long getEventNum() {
		return eventNum;
	}
	
	public void setEventNum(long eventNum) {
		this.eventNum = eventNum;
	}
	
	@Column(name = "FIRST_NM", unique = true, nullable = false, length = 50)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "LAST_NM", unique = true, nullable = false, length = 50)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "EMAIL_ADDR", unique = true, nullable = false, length = 50)
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	
	@Column(name = "OCCUPATION", unique = true, nullable = false, length = 50)
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	@Column(name = "AGE", unique = true, nullable = false)
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	
	@Column(name = "ETHNICITY", unique = true, nullable = false, length = 50)
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	
	@Column(name = "HEIGHT", unique = true, nullable = false, length = 50)
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	@Column(name = "PHOTO_URL", unique = true, nullable = false, length = 255)
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	@Column(name = "REG_STATUS", unique = true, nullable = false, length = 50)
	public String getRegStatus() {
		return regStatus;
	}
	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}
	
	@Column(name = "ANSWER_1", unique = true, nullable = false, length = 100)
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	
	@Column(name = "ANSWER_2", unique = true, nullable = false, length = 100)
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	
	@Column(name = "ANSWER_3", unique = true, nullable = false, length = 100)
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	
	
}
