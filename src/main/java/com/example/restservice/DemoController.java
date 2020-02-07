/**
 * 
 */
package com.example.restservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anton
 *
 */
@RestController
@RequestMapping(value = "/b")
public class DemoController {
	UserRepository user_repository;
	
	@RequestMapping( method = RequestMethod.GET)
	public List<User> getAll() {
		return (List<User>) user_repository.findAll();
	}
}
