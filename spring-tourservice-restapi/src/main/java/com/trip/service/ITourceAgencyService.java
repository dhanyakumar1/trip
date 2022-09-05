package com.trip.service;

import java.util.List;

import com.trip.model.TourceAgency;

public interface ITourceAgencyService {
 void addAgency(TourceAgency agency);
 void updateAgency(TourceAgency agency);
 void deleteAgency(int agency_id);
	
 	List<TourceAgency> getAll();
	TourceAgency getById(int agency_id);
	TourceAgency getByLocation(String location);
	
}
