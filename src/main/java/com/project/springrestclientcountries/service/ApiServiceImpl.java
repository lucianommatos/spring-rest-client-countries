package com.project.springrestclientcountries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.project.springrestclientcountries.model.Country;

@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	
	private final String api_url;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
		this.restTemplate = restTemplate;
		this.api_url = api_url;
	}

	@Override
	public List<Country> getCountries(String name) {
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(api_url).path("name/").path(name);
		
		Country[] countries = restTemplate.getForObject(uriBuilder.toUriString(), Country[].class);
		
		List<Country> result = new ArrayList<Country>();
		
		for (Country country : countries) {
			result.add(country);
		}
		
		return result;
	}

}
