package com.backpacktravel.controller;

import com.backpacktravel.dto.airportDto.AirportDto;
import com.backpacktravel.dto.flightResponseDto.BestFlightDto;
import com.backpacktravel.dto.locationRentACar.LocationRentACarDto;
import com.backpacktravel.dto.rentACarResponseDto.RentACarResponseDto;
import com.backpacktravel.facade.SkyscannerFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/skyscanner")
@RequiredArgsConstructor
public class SkyscannerController {
    private final SkyscannerFacade skyscannerFacade;

    @GetMapping(value = "/getAirports/{airport}")
    public ResponseEntity<List<AirportDto>> getSkyskannerAirports(@PathVariable String airport) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerAirports(airport));
    }

    @GetMapping(value = "/getBestFlight/{flightDetails}")
    public ResponseEntity<BestFlightDto> getSkyskannerBestFlight(@PathVariable String flightDetails) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerBestFlights(flightDetails));
    }

    @GetMapping(value = "/getLocationsRentACar/{location}")
    public ResponseEntity<List<LocationRentACarDto>> getSkyskannerLocationsRentACar(@PathVariable String location) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerLocationsRentACar(location));
    }

    @GetMapping(value = "/getRentACar")
    public ResponseEntity<RentACarResponseDto> getSkyskannerRentACar(@PathVariable String rentACarDetails) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerRentACar(rentACarDetails));
    }
}
