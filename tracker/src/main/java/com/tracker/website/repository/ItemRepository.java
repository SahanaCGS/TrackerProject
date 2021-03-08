package com.tracker.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.website.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
