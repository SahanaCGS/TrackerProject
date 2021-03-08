package com.tracker.website.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.tracker.website.enums.TripStatus;

@Entity
@Table(name="Trip")
public class Trip {

	@Id
	@Column(name="trid")
	private int TripId;
	
	@Column(name="tfrom")
	private String From;
	
	@Column(name="tto")
	private String To;
	
	@Column(name="tstatus")
	private TripStatus TripStatus;
	
	@Column(name="checkpointplace ")
	private String CheckpointPlace;
	
	@Column(name="checkpointarriveddate  ")
	private Date CheckpointArrivedDate;
	
	@Column(name="checkpointarrivedtime   ")
	private Time CheckpointArrivedTime;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tripmapped", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Truck truck;
	
	
	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}

	public int getTripId() {
		return TripId;
	}

	public void setTripId(int tripId) {
		TripId = tripId;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getTo() {
		return To;
	}

	public void setTo(String to) {
		To = to;
	}

	public TripStatus getTripStatus() {
		return TripStatus;
	}

	public void setTripStatus(TripStatus tripStatus) {
		TripStatus = tripStatus;
	}

	public String getCheckpointPlace() {
		return CheckpointPlace;
	}

	public void setCheckpointPlace(String checkpointPlace) {
		CheckpointPlace = checkpointPlace;
	}

	public Date getCheckpointArrivedDate() {
		return CheckpointArrivedDate;
	}

	public void setCheckpointArrivedDate(Date checkpointArrivedDate) {
		CheckpointArrivedDate = checkpointArrivedDate;
	}

	public Time getCheckpointArrivedTime() {
		return CheckpointArrivedTime;
	}

	public void setCheckpointArrivedTime(Time checkpointArrivedTime) {
		CheckpointArrivedTime = checkpointArrivedTime;
	}

	public Trip(int tripId, String from, String to, com.tracker.website.enums.TripStatus tripStatus,
			String checkpointPlace, Date checkpointArrivedDate, Time checkpointArrivedTime) {
		super();
		TripId = tripId;
		From = from;
		To = to;
		TripStatus = tripStatus;
		CheckpointPlace = checkpointPlace;
		CheckpointArrivedDate = checkpointArrivedDate;
		CheckpointArrivedTime = checkpointArrivedTime;
	}

	public Trip() {
		
	}
	
	
}
