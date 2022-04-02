package com.backpacktravel.controller;

import com.backpacktravel.domain.CityDetailsParameterDto;
import com.backpacktravel.domain.cityDetailsResponseDto.CityDetailsResponseDto;
import com.backpacktravel.domain.cityResponseDto.CityResponseDto;
import com.backpacktravel.domain.currencyResponseDto.CurrencyResponseDto;
import com.backpacktravel.facade.CitiesCostOfLivingFacade;
import com.backpacktravel.mapper.CitiesCostOfLivingMapper;
import jdk.jfr.ContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/citiescostofliving")
@RequiredArgsConstructor
public class CitiesCostOfLivingController {
    private final CitiesCostOfLivingFacade citiesCostOfLivingFacade;
    private final CitiesCostOfLivingMapper citiesCostOfLivingMapper;

    @GetMapping(value = "/getCities")
    public ResponseEntity<CityResponseDto> getCitiesCostOfLivingCities() {
        return ResponseEntity.ok(citiesCostOfLivingFacade.fetchCitiesCostOfLivingCity());
    }

    @GetMapping(value = "/getCurrencies")
    public ResponseEntity<CurrencyResponseDto> getCitiesCostOfLivingCurrencies() {
        return ResponseEntity.ok(citiesCostOfLivingFacade.fetchCitiesCostOfLivingCurrency());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CityDetailsResponseDto> getCitiesCostOfLivingCityDetails(@RequestBody CityDetailsParameterDto cityDetailsParameterDto) {
        return ResponseEntity.ok(citiesCostOfLivingFacade.fetchCitiesCostOfLivingCityDetails(cityDetailsParameterDto));
    }
}