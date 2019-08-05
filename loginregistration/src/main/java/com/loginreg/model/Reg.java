package com.loginreg.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.repository.annotation.Id;

@Component
@Document
public class Reg {
 
	@Id
	private Integer id;
	@NotNull
	private String name;
	@NotNull
	private String password;
	private String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
}
