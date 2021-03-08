package com.tracker.website.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Driver")
public class Driver {
	
	@Id
	@Column(name="did")
	private int DriverID;
	
	@Column(name="dname")
	private String DriverName ;
	
	@Column(name="contactnumber")
	private String ContactNumber;

	public int getDriverID() {
		return DriverID;
	}

	public void setDriverID(int driverID) {
		DriverID = driverID;
	}

	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public Driver(int driverID, String driverName, String contactNumber) {
		super();
		DriverID = driverID;
		DriverName = driverName;
		ContactNumber = contactNumber;
	}

	public Driver() {
	
	} 
	
	
}
