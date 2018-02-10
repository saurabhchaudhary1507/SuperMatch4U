package com.superMatch4U.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.superMatch4U.common.model.Person;
import com.superMatch4U.common.model.Shop;

/**
 * @author Saurabh
 *
 */
@Controller
@RequestMapping("/person")
public class AdminController {

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public @ResponseBody List<Person> getUserDetails() {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Saurabh","nn","Chaudhary"));
		persons.add(new Person("Devendra","nn","Chaudhary"));
		persons.add(new Person("Michael","nn","Jackson"));
		return persons;

	}
	
	@RequestMapping(value = "/saveUserDetails", method = RequestMethod.POST,headers="Accept=application/json")
	public @ResponseBody Person saveUserDetails(@RequestBody Person person) {
		System.out.println(person.getFirstName());
		System.out.println("Backend Called");
		return person;

	}

}