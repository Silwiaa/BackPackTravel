package com.backpacktravel.facade;

import com.backpacktravel.domain.CityDetailsParameterDto;
import com.backpacktravel.domain.cityDetailsResponseDto.CityDetailsResponseDto;
import com.backpacktravel.domain.cityResponseDto.CityResponseDto;
import com.backpacktravel.domain.currencyResponseDto.CurrencyResponseDto;
import com.backpacktravel.service.CitiesCostOfLivingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public CityDetailsResponseDto fetchCitiesCostOfLivingCityDetails(CityDetailsParameterDto cityDetailsParameterDto) {
        return citiesCostOfLivingService.fetchCitiesCostOfLivingCityDetails(cityDetailsParameterDto);
    }
}
