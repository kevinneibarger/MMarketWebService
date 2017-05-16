/**
 * 
 */
package com.mmarket.junit.test;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mmarket.dao.MMarketManViewTableDAO;
import com.mmarket.model.MMarketManViewTable;

/**
 * @author kevin
 *
 */

// NOTE: UNCOMMENT Code in The AppConfig class before running test!
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class MMarketManViewTableTest {

    @Autowired
	private MMarketManViewTableDAO mmDao;

	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAllViewed() {

		List<MMarketManViewTable> viewed = mmDao.getAllViews();
		Assert.assertNotNull(viewed);
		
		for (MMarketManViewTable m : viewed) {
			Assert.assertNotNull(m);
			System.out.println("Event Id: "+m.getEventRec().getEventId());
			System.out.println("Event Name: "+m.getEventRec().getEventName());
			System.out.println("Event City: "+m.getEventRec().getEventCity());
			System.out.println("Venue Name: "+m.getEventRec().getVenueName());
			System.out.println("Venue City: "+m.getEventRec().getVenueCity());
		}
		
	}
	
	@Test
	public void getManViewedById() {
		
		long viewedId = 5001;
		
		MMarketManViewTable viewedDude = mmDao.getManViewedById(viewedId);
		Assert.assertNotNull(viewedDude);
		Assert.assertNotNull(viewedDude.getManRec().getFirstName());
		
	}

	@Test
	public void getMenViewedByEventId() {
		 long eventId = 2001;
		 List<MMarketManViewTable> getManViewedByEventId = mmDao.getManViewedByEventId(eventId);
		 Assert.assertNotNull(getManViewedByEventId);
		 Assert.assertEquals(2, getManViewedByEventId.size());
	}
}
