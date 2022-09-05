package com.trip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Places {
	@Column(length = 30)
	private String placeName;
	@Id
	@GeneratedValue(generator = "place_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "place_id",sequenceName = "place_id",initialValue = 100,allocationSize = 1)
	private Integer placeId;
	private long pincode;
	private String state;
	public Places() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Places(String placeName, long pincode, String state) {
		super();
		this.placeName = placeName;
		this.pincode = pincode;
		this.state = state;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public Integer getPlaceId() {
		return placeId;
	}
	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Places [placeName=" + placeName + ", pincode=" + pincode + ", state=" + state + "]";
	}
	
	
}
