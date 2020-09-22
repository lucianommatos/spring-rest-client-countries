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
	
	private final String api_uri;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.uri}") String api_uri) {
		this.restTemplate = restTemplate;
		this.api_uri = api_uri;
	}

	@Override
	public List<Country> getCountries(String name) {
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(api_uri).path("name/").path(name);
		
		Country[] countries = restTemplate.getForObject(uriBuilder.toUriString(), Country[].class);
		
		List<Country> result = new ArrayList<Country>();
		
		for (Country country : countries) {
			result.add(country);
		}
		
		return result;
	}

}
