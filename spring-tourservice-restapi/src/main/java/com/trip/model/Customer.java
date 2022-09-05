package com.trip.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Column(length = 20)
	private String customerName;
	@Id
	@GeneratedValue(generator = "customer_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "customer_id",sequenceName = "customer_id",initialValue = 100,allocationSize = 1)
	private Integer customerId;
	private int tripDuration;
	@ManyToMany(mappedBy = "places",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "places_id")
	private Set<Places> places;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, int tripDuration) {
		super();
		this.customerName = customerName;
		this.tripDuration = tripDuration;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public int getTripDuration() {
		return tripDuration;
	}
	public void setTripDuration(int tripDuration) {
		this.tripDuration = tripDuration;
	}
	public Set<Places> getPlaces() {
		return places;
	}
	public void setPlaces(Set<Places> places) {
		this.places = places;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", tripDuration=" + tripDuration + "]";
	}
	
	
}
