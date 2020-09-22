package com.project.springrestclientcountries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.springrestclientcountries.model.Country;

@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;

	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<Country> getCountries(String name) {
		List<Country> result = new ArrayList<Country>();
		Country[] countries;
		countries = restTemplate.getForObject("https://restcountries.eu/rest/v2/name/brazil", Country[].class);
		for (Country country : countries) {
			System.out.println("Adding Country");
			System.out.println("Name: " + country.getName());
			System.out.println("Capital: " + country.getCapital());
			result.add(country);
		}
		return result;
	}

}
