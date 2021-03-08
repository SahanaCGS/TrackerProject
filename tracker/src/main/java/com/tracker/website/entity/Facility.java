package com.tracker.website.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tracker.website.enums.FacilityStatus;

@Entity
@Table(name="Facility")
public class Facility {
	@Id
	@Column(name="fid")
	private int FacilityId;
	
	@Column(name="fname")
	private String FacilityName;
	
	@Column(name="fstatus")
	private FacilityStatus FacilityStatus;


	@OneToMany(targetEntity = Item.class , cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "facility")
	 private List<Item> item;
	 
	@OneToMany(targetEntity = Truck.class , cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "facility")
	private List<Truck> truck;

	 
	
	public List<Truck> getTruck() {
		return truck;
	}

	public void setTruck(List<Truck> truck) {
		this.truck = truck;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public int getFacilityId() {
		return FacilityId;
	}

	public void setFacilityId(int facilityId) {
		FacilityId = facilityId;
	}

	public String getFacilityName() {
		return FacilityName;
	}

	public void setFacilityName(String facilityName) {
		FacilityName = facilityName;
	}

	public FacilityStatus getFacilityStatus() {
		return FacilityStatus;
	}

	public void setFacilityStatus(FacilityStatus facilityStatus) {
		FacilityStatus = facilityStatus;
	}

	public Facility(int facilityId, String facilityName, com.tracker.website.enums.FacilityStatus facilityStatus) {
		super();
		FacilityId = facilityId;
		FacilityName = facilityName;
		FacilityStatus = facilityStatus;
	}

	public Facility() {
		
	}
	
	
}
