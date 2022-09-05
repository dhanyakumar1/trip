package com.trip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class VehicleType {
	@Column(length = 20)
	private String vehicleType;
	@Id
	@GeneratedValue(generator = "vehicle_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "vehicle_id",sequenceName = "vehicle_id",initialValue = 100,allocationSize = 1)
	private Integer vehicleId;
	private String vehicleNumber;
	private String DriverName;
	private long phonenumber;
	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleType(String vehicleType, String vehicleNumber, String driverName, long phonenumber) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		DriverName = driverName;
		this.phonenumber = phonenumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Integer getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "VehicleType [vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + ", DriverName="
				+ DriverName + ", phonenumber=" + phonenumber + "]";
	}
	
	
}