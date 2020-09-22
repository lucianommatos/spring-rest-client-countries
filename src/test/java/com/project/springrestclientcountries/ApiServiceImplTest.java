package com.project.springrestclientcountries;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.springrestclientcountries.service.ApiService;

@SpringBootTest
public class ApiServiceImplTest {
	
	@Autowired
	ApiService apiService;
	
	@Test
	public void testGetCountries() {
		Assertions.assertEquals("Brazil", apiService.getCountries("Brasil").get(0).getName());
	}

}
