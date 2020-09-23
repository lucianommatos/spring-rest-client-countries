package com.project.springrestclientcountries.service;

import java.util.List;

import com.project.springrestclientcountries.model.Country;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiService {
	
	List<Country> getCountries(String name);

}
