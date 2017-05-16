/**
 * 
 */
package com.mmarket.dao;

import java.io.Serializable;
import java.sql.Timestamp;
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
	public MMarketPatronTable getPatronByBirthYear(String birthYear);
	public List<MMarketPatronTable> getPatronsByCreateDate(Timestamp createDate);
	public List<MMarketPatronTable> getPatronsByGender(String gender);
}
