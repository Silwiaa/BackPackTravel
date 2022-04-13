package com.backpacktravel.service;

import com.backpacktravel.client.SkyscannerClient;
import com.backpacktravel.dto.airportDto.AirportDto;
import com.backpacktravel.dto.flightResponseDto.BestFlightDto;
import com.backpacktravel.dto.locationRentACar.LocationRentACarDto;
import com.backpacktravel.dto.rentACarResponseDto.RentACarResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkyscannerService {
    private final SkyscannerClient skyscannerClient;

    public List<AirportDto> fetchSkyscannerAirports(String airport) {
        return skyscannerClient.getAirport(airport);
    }

    public BestFlightDto fetchSkyscannerBestFlights(String flightDetails) {
        return skyscannerClient.getBestFlights(flightDetails);
    }

    public List<LocationRentACarDto> fetchSkyscannerLocationsRentACar(String location) {
        return skyscannerClient.getLocationsRentACar(location);
    }

    public RentACarResponseDto fetchSkyscannerRentACar(String rentACarDetails) {
        return skyscannerClient.getRentACar(rentACarDetails);
    }
}
