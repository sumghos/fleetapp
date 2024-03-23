package com.kindsonthegenius.fleetapp.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Contact;
import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.ContactRepository;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	
	//Get List of Countries 
	public List<Country> findAll(){
		return countryRepository.findAll();
		
	}
	
	//Post New Country 
	public void addNewCountry(Country country) {
		countryRepository.save(country);
	}
	
	//Find Country by ID 
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

}
