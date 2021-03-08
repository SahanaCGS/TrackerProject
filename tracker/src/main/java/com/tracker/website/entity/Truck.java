package com.tracker.website.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name="Truck")
public class Truck {
	@Id
	@Column(name="tid")
	private int TruckId;
	
	@Column(name="transporter")
	private String Transporter;
	
	@Column(name="totalitemvalue")
	private String TotalItemValue;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "drivermapped")
    private Driver driver;
    
	@OneToMany(targetEntity = Trip.class , cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "truck")
    private List<Trip> trip;
    
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "truckmapped", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Facility facility;
	
    
	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public List<Trip> getTrip() {
		return trip;
	}

	public void setTrip(List<Trip> trip) {
		this.trip = trip;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public int getTruckId() {
		return TruckId;
	}

	public void setTruckId(int truckId) {
		TruckId = truckId;
	}

	public String getTransporter() {
		return Transporter;
	}

	public void setTransporter(String transporter) {
		Transporter = transporter;
	}

	public String getTotalItemValue() {
		return TotalItemValue;
	}

	public void setTotalItemValue(String totalItemValue) {
		TotalItemValue = totalItemValue;
	}

	public Truck(int truckId, String transporter, String totalItemValue) {
		super();
		TruckId = truckId;
		Transporter = transporter;
		TotalItemValue = totalItemValue;
	}

	public Truck() {

	}
	
	
}
