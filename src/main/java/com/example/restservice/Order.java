/**
 * 
 */
package com.example.restservice;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author anton
 *
 */
@Entity
public class Order {
	@Id
	@GeneratedValue
	@NotNull
	private Long id;
	private Date create_at;
	@OneToMany
	private List<Product> products;
	@Min(value = 0)
	private Float order_sum;
	
	public Long getId() {
		return id;
	}
	
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Float getOrder_sum() {
		return order_sum;
	}
	public void setOrder_sum(float order_sum) {
		this.order_sum = order_sum;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", create_at=" + create_at + ", products=" + products
				+ ", order_sum=" + order_sum + "]";
	}
	
	
}
