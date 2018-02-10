package com.superMatch4U.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superMatch4U.common.Dao.AdminDao;
import com.superMatch4U.common.model.Person;

/**
 * @author Saurabh
 *
 */

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;

	@Override
	public List<Person> getAllUsers() {
		
		return adminDao.getAllUser();
	}

	
	
}
