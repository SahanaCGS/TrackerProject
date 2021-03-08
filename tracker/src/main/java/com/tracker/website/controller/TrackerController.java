package com.tracker.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.website.entity.Truck;
import com.tracker.website.repository.DriverRepository;
import com.tracker.website.repository.FacilityRepository;
import com.tracker.website.repository.ItemRepository;
import com.tracker.website.repository.TripRepository;
import com.tracker.website.repository.TruckRepository;


@RestController
@RequestMapping("/trackerApp")
public class TrackerController {

	@Autowired
	private TruckRepository truckRepository;
	
	@Autowired
	private DriverRepository driverRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private FacilityRepository facilityRepository;
	
	@Autowired
	private TripRepository tripRepository;
	
	@RequestMapping(value = "/getTruckDetails", method = RequestMethod.GET)
	public @ResponseBody List<Truck> findTrucks(){
		return truckRepository.findAll();
	}
//	@RequestMapping(value = "/getItemDetails", method = RequestMethod.GET)
//	public @ResponseBody List<Truck> findFacilities(){
//		return truckRepository.findAll();
//	}
//	
}
