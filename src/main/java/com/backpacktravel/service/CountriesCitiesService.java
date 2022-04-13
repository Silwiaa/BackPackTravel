package com.backpacktravel.service;

import com.backpacktravel.client.CountriesCitiesClient;
import com.backpacktravel.dto.countriesCitiesResponseDto.CityResponseDto;
import com.backpacktravel.dto.countriesCitiesResponseDto.CountryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountriesCitiesService {
    private final CountriesCitiesClient countriesCitiesClient;

    public CountryDto fetchCountries() {
        return countriesCitiesClient.getCountries();
    }

    public CityResponseDto fetchCitiesInCountry(String countryCode) {
        return countriesCitiesClient.getCitiesInCountry(countryCode);
    }
}
