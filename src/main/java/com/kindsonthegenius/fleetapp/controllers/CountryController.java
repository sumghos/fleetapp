package com.kindsonthegenius.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.services.CountryService;

import org.springframework.ui.Model;

@Controller
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/Country")
	public String getCountryList(Model model) {
		model.addAttribute("Country", countryService.findAll());
		return "Country";
	}
	
	//Add Country
	@PostMapping(value = "Country/addNewCountry")
	public String addNewCountry(Country country) {
		countryService.addNewCountry(country);
		return "redirect:/Country";
	}
	
	//Update Country
	@RequestMapping(value = "/Country/findbyidCountry/{id}")
	@ResponseBody
	public Optional<Country> findById(@PathVariable("id") Integer id) {
		return countryService.findById(id);
	}
	
	@RequestMapping(value = "/Country/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String updateCountry(Country country) {
		countryService.addNewCountry(country);
		return "redirect:/Country";
	}

}
