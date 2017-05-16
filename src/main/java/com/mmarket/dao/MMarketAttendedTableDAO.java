/**
 * 
 */
package com.mmarket.dao;

import java.sql.Timestamp;
import java.util.List;

import com.mmarket.model.MMarketAttendedTable;

/**
 * @author kevin
 *
 */
public interface MMarketAttendedTableDAO {

	public List<MMarketAttendedTable> getAllAttendees();
	public List<MMarketAttendedTable> getAttendeesEventById(long eventId);
	public List<MMarketAttendedTable> getAttendeesByViewDate(Timestamp viewDate);
	public MMarketAttendedTable getAttendedByPatronId(long patronId);
}
