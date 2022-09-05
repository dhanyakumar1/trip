package com.trip.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trip.service.ITourceAgencyService;

@SpringBootApplication
public class SpringTourceAgencyRestapi1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringTourceAgencyRestapi1Application.class, args);
	}

ITourceAgencyService tourceAgencyService;
@Autowired
	public void setTourceAgencyService(ITourceAgencyService tourceAgencyService) {
	this.tourceAgencyService = tourceAgencyService;
}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
