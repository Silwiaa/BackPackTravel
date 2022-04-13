package com.backpacktravel.facade;

import com.backpacktravel.dto.countriesCitiesResponseDto.CityResponseDto;
import com.backpacktravel.dto.countriesCitiesResponseDto.CountryDto;
import com.backpacktravel.service.CountriesCitiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CountriesCitiesFacade {
    private final CountriesCitiesService countriesCitiesService;

    public CountryDto fetchCountries() {
        return countriesCitiesService.fetchCountries();
    }

    public CityResponseDto fetchCitiesInCountry(String countryCode) {
        return countriesCitiesService.fetchCitiesInCountry(countryCode);
    }
}
