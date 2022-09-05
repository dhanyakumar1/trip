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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class TourceAgency {
	@Column(length = 20)
	private String agencyName;
	@Id
	@GeneratedValue(generator = "agency_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "agency_id",sequenceName = "agency_id",initialValue = 100,allocationSize = 1)
	private Integer agencyId;
	private String location;
	private double amount;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "vehicle_id")
	private VehicleType vehicleType;
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Set<Customer> customer;
	public TourceAgency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TourceAgency(String agencyName, Integer agencyId, String location, double amount, VehicleType vehicleType,
			Set<Customer> customer) {
		super();
		this.agencyName = agencyName;
		this.agencyId = agencyId;
		this.location = location;
		this.amount = amount;
		this.vehicleType = vehicleType;
		this.customer = customer;
	}


	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public Integer getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "TourceAgency [agencyName=" + agencyName + ", location=" + location + ", amount=" + amount + "]";
	}
	
	
	
	
}
