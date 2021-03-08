package com.tracker.website.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.tracker.website.enums.ItemType;

@Entity
@Table(name="Item")
public class Item {
	@Id
	@Column(name="id")
	private int ItemId;
	
	@Column(name="name")
	private String ItemName;
	
	@Column(name="type")
	private ItemType ItemType;
	
	@Column(name="weight")
	private int Weight;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "itemmapped", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Facility facility;
	
    
	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public int getItemId() {
		return ItemId;
	}

	public void setItemId(int itemId) {
		ItemId = itemId;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public ItemType getItemType() {
		return ItemType;
	}

	public void setItemType(ItemType itemType) {
		ItemType = itemType;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public Item(int itemId, String itemName, com.tracker.website.enums.ItemType itemType, int weight) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		ItemType = itemType;
		Weight = weight;
	}

	public Item() {
	
	}
	
	
}
