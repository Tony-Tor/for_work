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
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findByOrder(Order order);

	Product findById(long id);
}
