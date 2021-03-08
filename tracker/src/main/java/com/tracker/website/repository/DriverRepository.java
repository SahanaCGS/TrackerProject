package com.tracker.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.website.entity.Driver;


public interface DriverRepository extends JpaRepository<Driver, Integer>{

}
