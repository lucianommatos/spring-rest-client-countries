package com.project.springrestclientcountries.service;

import java.util.List;

import com.project.springrestclientcountries.model.Country;

public interface ApiService {
	
	List<Country> getCountries(String name);

}
