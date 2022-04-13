package com.backpacktravel.controller;

import com.backpacktravel.dto.countriesCitiesResponseDto.CityResponseDto;
import com.backpacktravel.dto.countriesCitiesResponseDto.CountryDto;
import com.backpacktravel.facade.CountriesCitiesFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/countries")
@RequiredArgsConstructor
public class CountriesCitiesController {
    private final CountriesCitiesFacade countriesCitiesFacade;

    @GetMapping(value = "/getCountries")
    public ResponseEntity<CountryDto> getCountries() {
        return ResponseEntity.ok(countriesCitiesFacade.fetchCountries());
    }

    @GetMapping(value = "/getCities/{countryCode}")
    public ResponseEntity<CityResponseDto> getCitiesInCountryCountries(@PathVariable String countryCode) {
        return ResponseEntity.ok(countriesCitiesFacade.fetchCitiesInCountry(countryCode));
    }
}