/**
 * 
 */
package com.mmarket.junit.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author kevin
 *
 */
//@Configuration
//@ComponentScan(basePackages={"com.mmarket.service, com.mmarket.dao, com.mmarket.dao.impl"})
//@ImportResource("classpath:*/spring-servlet.xml")
@Configuration 
@EnableTransactionManagement
public class AppConfig {
// NOTE: UNCOMMENT Below to run JUNIT Tests	
//	@Bean  
//    public MMarketManViewTableDAOImpl mmarketDAO() {  
//        return new MMarketManViewTableDAOImpl();  
//    }
//	@Bean
//	public HibernateTemplate hibernateTemplate() {
//		return new HibernateTemplate(sessionFactory());
//	}
//	@Bean
//	public SessionFactory sessionFactory() {
//		return new LocalSessionFactoryBuilder(getDataSource()).addAnnotatedClasses(MMarketManViewTable.class, 
//				MMarketManTable.class, MMarketEventTable.class, MMarketPatronTable.class, MMarketManViewTableService.class).buildSessionFactory();
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
