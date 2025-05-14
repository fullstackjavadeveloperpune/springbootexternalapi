package com.fullstack.controller;

import com.fullstack.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/getcountryinfo")
    public ResponseEntity<String> getCountryInfo() {
        return ResponseEntity.ok(countryService.getCountryInfo());
    }
}
