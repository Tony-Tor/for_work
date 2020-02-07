/**
 * 
 */
package com.example.restservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



/**
 * @author anton
 *
 */
public interface UserRepository  extends CrudRepository<User, Long> {
	
	List<User> findByLastName(String fullName);

	User findById(long id);
}
