package com.trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trip.model.TourceAgency;
import com.trip.repository.ITourceAgencyRepository;
@Service
public class TourceAgencyServiceImpl implements ITourceAgencyService {
@Autowired
ITourceAgencyRepository repository;
	
	@Override
	public void addAgency(TourceAgency agency) {
		repository.save(agency);
	}

	@Override
	public void updateAgency(TourceAgency agency) {
		repository.save(agency);

	}

	@Override
	public void deleteAgency(int agency_id) {
		repository.deleteById(agency_id);
	}

	@Override
	public List<TourceAgency> getAll() {
		return repository.findAll();
	}

	@Override
	public TourceAgency getById(int agency_id) {
		return repository.findById(agency_id);
	}

	@Override
	public TourceAgency getByLocation(String location) {
		return repository.findByLocation(location);
	}

}
