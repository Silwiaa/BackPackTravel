package com.backpacktravel.facade;

import com.backpacktravel.domain.CityDetailsByCoordinatesParameterDto;
import com.backpacktravel.domain.cityDetailsResponseDto.CityDetailsResponseDto;
import com.backpacktravel.domain.cityResponseDto.CityResponseDto;
import com.backpacktravel.domain.currencyResponseDto.CurrencyResponseDto;
import com.backpacktravel.service.CitiesCostOfLivingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CitiesCostOfLivingFacade {
    private final CitiesCostOfLivingService citiesCostOfLivingService;

    public CityResponseDto fetchCitiesCostOfLivingCity() {
        return citiesCostOfLivingService.fetchCitiesCostOfLivingCity();
    }

    public CurrencyResponseDto fetchCitiesCostOfLivingCurrency() {
        return citiesCostOfLivingService.fetchCitiesCostOfLivingCurrency();
    }

    public CityDetailsResponseDto fetchCitiesCostOfLivingCityByCoordinatesDetails(CityDetailsByCoordinatesParameterDto cityDetailsByCoordinatesParameterDto) {
        return citiesCostOfLivingService.fetchCitiesCostOfLivingCityByCoordinatesDetails(cityDetailsByCoordinatesParameterDto);
    }
}
