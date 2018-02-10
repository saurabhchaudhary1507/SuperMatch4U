/**
 * 
 */
package com.superMatch4U.common.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.superMatch4U.common.model.Person;

/**
 * @author Saurabh
 *
 */
@Repository
public class AdminDaoImpl extends GenericDao implements AdminDao {

	@Override
	public List<Person> getAllUser() {
		String SQL = "select * from Student";
	      List <Person> students = jdbcTemplateObject.query(SQL, new UserMapper());
	      return students;// TODO Auto-generated method stub
	}

}
