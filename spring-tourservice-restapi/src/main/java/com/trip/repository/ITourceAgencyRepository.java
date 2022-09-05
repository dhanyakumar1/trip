package com.trip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.model.TourceAgency;
@Repository
public interface ITourceAgencyRepository extends JpaRepository<TourceAgency, Integer>{

	List<TourceAgency> findAll();
	TourceAgency findById(int agency_id);
	TourceAgency findByLocation(String location);
	
	
}
