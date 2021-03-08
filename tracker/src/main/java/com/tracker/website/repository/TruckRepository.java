package com.tracker.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.website.entity.Truck;

public interface TruckRepository extends JpaRepository<Truck, Integer> {

}
