package com.mmarket.dao;

import java.util.List;

import com.mmarket.model.MMarketSearchHistTable;

public interface MMarketSearchHistTableDAO {

	public MMarketSearchHistTable getSearchHistById(long id);
	public List<MMarketSearchHistTable> getAllSearchHistory();
	public List<MMarketSearchHistTable> getSearchHistoryByManId(long manId);
	public List<MMarketSearchHistTable> getSearchHistoryByEventId(long eventId);
	public List<MMarketSearchHistTable> getSearchHistoryByPatronId(long patronId);
}
