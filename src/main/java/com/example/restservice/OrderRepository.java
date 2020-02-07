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
public interface OrderRepository extends CrudRepository<Order, Long> {
	
	List<Order> findByUser(User user);

	Order findById(long id);
}
