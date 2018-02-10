/**
 * 
 */
package com.superMatch4U.common.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.superMatch4U.common.model.Person;

/**
 * @author Saurabh
 *
 */
public class UserMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Person person = new Person();
		person.setFirstName(rs.getString("first_name"));
		person.setMiddleName(rs.getString("middle_name"));
		person.setLastName(rs.getString("last_name"));

		return person;
	}
}
