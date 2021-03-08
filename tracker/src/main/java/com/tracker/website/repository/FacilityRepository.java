package com.tracker.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.website.entity.Facility;


public interface FacilityRepository extends JpaRepository<Facility, Integer>{

}
