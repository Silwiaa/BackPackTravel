package com.backpacktravel.service;

import com.backpacktravel.client.SkyscannerClient;
import com.backpacktravel.domain.HotelParameterDto;
import com.backpacktravel.domain.RentACarParameterDto;
import com.backpacktravel.domain.airportDto.AirportDto;
import com.backpacktravel.domain.FlightParameterDto;
import com.backpacktravel.domain.flightResponseDto.FlightResponseDto;
import com.backpacktravel.domain.hotelResponseDto.HotelResponseDto;
import com.backpacktravel.domain.locationHotelDto.LocationHotelDto;
import com.backpacktravel.domain.locationRentACar.LocationRentACarDto;
import com.backpacktravel.domain.rentACarResponseDto.RentACarResponseDto;
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

    public FlightResponseDto fetchSkyscannerBestFlight(FlightParameterDto destinationDto, boolean isBest) {
        return skyscannerClient.getFlight(destinationDto, isBest);
    }

    public List<LocationHotelDto> fetchSkyscannerLocationsHotel(String location) {
        return skyscannerClient.getLocationsHotel(location);
    }

    public HotelResponseDto fetchSkyscannerHotel(HotelParameterDto hotelParameterDto) {
        return skyscannerClient.getHotel(hotelParameterDto);
    }

    public List<LocationRentACarDto> fetchSkyscannerLocationsRentACar(String location) {
        return skyscannerClient.getLocationsRentACar(location);
    }

    public RentACarResponseDto fetchSkyscannerRentACar(RentACarParameterDto rentACarParameterDto) {
        return skyscannerClient.getRentACar(rentACarParameterDto);
    }
}
