package com.backpacktravel.facade;

import com.backpacktravel.domain.FlightParameterDto;
import com.backpacktravel.domain.HotelParameterDto;
import com.backpacktravel.domain.RentACarParameterDto;
import com.backpacktravel.domain.airportDto.AirportDto;
import com.backpacktravel.domain.flightResponseDto.FlightResponseDto;
import com.backpacktravel.domain.hotelResponseDto.HotelResponseDto;
import com.backpacktravel.domain.locationHotelDto.LocationHotelDto;
import com.backpacktravel.domain.locationRentACar.LocationRentACarDto;
import com.backpacktravel.domain.rentACarResponseDto.RentACarResponseDto;
import com.backpacktravel.service.SkyscannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SkyscannerFacade {
    private final SkyscannerService skyscannerService;

    public List<AirportDto> fetchSkyscannerAirports(String airport) {
        return skyscannerService.fetchSkyscannerAirports(airport);
    }

    public FlightResponseDto fetchSkyscannerFlight(FlightParameterDto destinationDto, boolean isBest) {
        return skyscannerService.fetchSkyscannerBestFlight(destinationDto, isBest);
    }

    public List<LocationHotelDto> fetchSkyscannerLocationsHotel(String location) {
        return skyscannerService.fetchSkyscannerLocationsHotel(location);
    }

    public HotelResponseDto fetchSkyscannerHotel(HotelParameterDto hotelParameterDto) {
        return skyscannerService.fetchSkyscannerHotel(hotelParameterDto);
    }

    public List<LocationRentACarDto> fetchSkyscannerLocationsRentACar(String location) {
        return skyscannerService.fetchSkyscannerLocationsRentACar(location);
    }

    public RentACarResponseDto fetchSkyscannerRentACar(RentACarParameterDto rentACarParameterDto) {
        return skyscannerService.fetchSkyscannerRentACar(rentACarParameterDto);
    }
}
