/**
 * 
 */
package com.mmarket.dao;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.mmarket.model.MMarketPatronTable;

/**
 * @author kevin
 *
 */
public interface MMarketPatronTableDAO extends Serializable {

	public List<MMarketPatronTable> getAllPatrons(); 
	public MMarketPatronTable getPatronById(long id);
	public MMarketPatronTable getPatronByName(String firstName, String lastName);
	public List<MMarketPatronTable> getPatronByBirthYear(String birthYear);
	public List<MMarketPatronTable> getPatronsByCreateDate(Date createDate);
	public List<MMarketPatronTable> getPatronsByGender(String gender);
}
