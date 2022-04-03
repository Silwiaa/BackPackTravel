package com.backpacktravel.controller;

import com.backpacktravel.domain.CityDetailsByCoordinatesParameterDto;
import com.backpacktravel.domain.cityDetailsResponseDto.CityDetailsResponseDto;
import com.backpacktravel.domain.cityResponseDto.CityResponseDto;
import com.backpacktravel.domain.currencyResponseDto.CurrencyResponseDto;
import com.backpacktravel.facade.CitiesCostOfLivingFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/citiescostofliving")
@RequiredArgsConstructor
public class CitiesCostOfLivingController {
    private final CitiesCostOfLivingFacade citiesCostOfLivingFacade;

    @GetMapping(value = "/getCities")
    public ResponseEntity<CityResponseDto> getCitiesCostOfLivingCities() {
        return ResponseEntity.ok(citiesCostOfLivingFacade.fetchCitiesCostOfLivingCity());
    }

    @GetMapping(value = "/getCurrencies")
    public ResponseEntity<CurrencyResponseDto> getCitiesCostOfLivingCurrencies() {
        return ResponseEntity.ok(citiesCostOfLivingFacade.fetchCitiesCostOfLivingCurrency());
    }

    @PostMapping(value = "/getCostsByCoordinates")
    public ResponseEntity<CityDetailsResponseDto> getCitiesCostOfLivingCityByCoordinatesDetails(CityDetailsByCoordinatesParameterDto cityDetailsByCoordinatesParameterDto) {
        return ResponseEntity.ok(citiesCostOfLivingFacade.fetchCitiesCostOfLivingCityByCoordinatesDetails(cityDetailsByCoordinatesParameterDto));
    }
}