package com.fullstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    @Autowired
    private RestTemplate restTemplate;

    String url = "https://jsonmock.hackerrank.com/api/countries?name=Japan";

    public String getCountryInfo() {

        return restTemplate.getForObject(url, String.class);

    }
}
