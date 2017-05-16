/**
 * 
 */
package com.mmarket.dao;

import java.util.List;

import com.mmarket.model.MMarketManTable;

/**
 * @author kevin
 *
 */
public interface MMarketManTableDAO {

	public List<MMarketManTable> getAllData();
	public MMarketManTable getManById(long manId);
	public List<MMarketManTable> getMenByEventId(long eventId);
	public List<MMarketManTable> getMenByOccupation(String occupation);
	public List<MMarketManTable> getMenByAge(String age);
	public List<MMarketManTable> getMenByAgeRange(String startAge, String endAge);
	public List<MMarketManTable> getMenByEthnicity(String ethnicity);
	public List<MMarketManTable> getMenByEthnicityRange(List<String> ethnicities);
	public List<MMarketManTable> getMenByHeightRange(String shortest, String tallest);
	public List<MMarketManTable> getMenByEventNum(long eventNum);
	public List<MMarketManTable> getMenByFirstName(String firstName);
}
