/**
 * 
 */
package com.example.restservice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author anton
 *
 */
@Entity
public class User {
	@Id
	@GeneratedValue
	@NotNull
	private Long id;
	private String fullname;
	@NotNull
	private String login;
	@NotNull
	@Size(max = 50, min = 6)
	private String password;
	@OneToMany
	private List<Order> orders;
	
	public long getId() {
		return id;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", login=" + login + ", password=" + password + "]";
	}
	
	
}
