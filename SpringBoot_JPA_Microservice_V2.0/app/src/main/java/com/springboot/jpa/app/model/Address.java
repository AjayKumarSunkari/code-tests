package com.springboot.jpa.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	private int addrid;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String postalcode;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PERSON_ID")
	private Person owner;
	
	public int getAddrid() {
		return addrid;
	}
	public void setAddrId(int addrid) {
		this.addrid = addrid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

}
