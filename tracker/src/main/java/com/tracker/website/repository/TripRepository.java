package com.tracker.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.website.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer>{

}
