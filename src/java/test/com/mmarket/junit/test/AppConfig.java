/**
 * 
 */
package com.mmarket.junit.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mmarket.dao.impl.MMarketEventTableDAOImpl;
import com.mmarket.dao.impl.MMarketManViewTableDAOImpl;
import com.mmarket.model.MMarketAttendedTable;
import com.mmarket.model.MMarketEventTable;
import com.mmarket.model.MMarketManTable;
import com.mmarket.model.MMarketManViewTable;
import com.mmarket.model.MMarketPatronTable;

/**
 * @author kevin
 *
 */
@Configuration 
@EnableTransactionManagement
public class AppConfig {
// NOTE: UNCOMMENT Below to run JUNIT Tests	
//	@Bean  
//    public MMarketEventTableDAOImpl mmarketEVTDAO() {  
//        return new MMarketEventTableDAOImpl();  
//    }
//	
//	@Bean  
//    public MMarketManViewTableDAOImpl mmarketMVTDAO() {  
//        return new MMarketManViewTableDAOImpl();  
//    }
//	
//	@Bean
//	public HibernateTemplate hibernateTemplate() {
//		return new HibernateTemplate(sessionFactory());
//	}
//	@Bean
//	public SessionFactory sessionFactory() {
//		return new LocalSessionFactoryBuilder(getDataSource()).addAnnotatedClasses(MMarketManViewTable.class, 
//				MMarketManTable.class, MMarketEventTable.class, 
//				MMarketPatronTable.class, 
//				MMarketAttendedTable.class).buildSessionFactory();
//	}
//	@Bean
//	public BasicDataSource getDataSource() {
//	    BasicDataSource dataSource = new BasicDataSource();
//	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//	    dataSource.setUrl("jdbc:mysql://localhost:3306/mmarket_db");
//	    dataSource.setUsername("root");
//	    dataSource.setPassword("");
//	 
//	    return dataSource;
//	}
}
