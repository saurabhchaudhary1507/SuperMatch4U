package com.superMatch4U.common.Dao;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * @author Saurabh
 *
 */
public abstract class GenericDao {

	private DataSource dataSource;
	protected JdbcTemplate jdbcTemplateObject;
	
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	
	
	
	
}
