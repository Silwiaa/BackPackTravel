package com.backpacktravel.controller;

import com.backpacktravel.domain.HotelParameterDto;
import com.backpacktravel.domain.RentACarParameterDto;
import com.backpacktravel.domain.airportDto.AirportDto;
import com.backpacktravel.domain.FlightParameterDto;
import com.backpacktravel.domain.flightResponseDto.FlightResponseDto;
import com.backpacktravel.domain.hotelResponseDto.HotelResponseDto;
import com.backpacktravel.domain.locationHotelDto.LocationHotelDto;
import com.backpacktravel.domain.locationRentACar.LocationRentACarDto;
import com.backpacktravel.domain.rentACarResponseDto.RentACarResponseDto;
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

    @GetMapping(value = "/getBestFlight")
    public ResponseEntity<FlightResponseDto> getSkyskannerBestFlight(@RequestBody FlightParameterDto destinationDto) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerFlight(destinationDto, true));
    }

    @GetMapping(value = "/getAllFlights")
    public ResponseEntity<FlightResponseDto> getSkyskannerAllFlights(@RequestBody FlightParameterDto destinationDto) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerFlight(destinationDto, false));
    }

    @GetMapping(value = "/getLocationsHotel/{location}")
    public ResponseEntity<List<LocationHotelDto>> getSkyskannerLocationsHotel(@PathVariable String location) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerLocationsHotel(location));
    }

    @GetMapping(value = "/getHotel")
    public ResponseEntity<HotelResponseDto> getSkyskannerHotel(@RequestBody HotelParameterDto hotelParameterDto) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerHotel(hotelParameterDto));
    }

    @GetMapping(value = "/getLocationsRentACar/{location}")
    public ResponseEntity<List<LocationRentACarDto>> getSkyskannerLocationsRentACar(@PathVariable String location) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerLocationsRentACar(location));
    }

    @GetMapping(value = "/getRentACar")
    public ResponseEntity<RentACarResponseDto> getSkyskannerRentACar(@RequestBody RentACarParameterDto rentACarParameterDto) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerRentACar(rentACarParameterDto));
    }
}
