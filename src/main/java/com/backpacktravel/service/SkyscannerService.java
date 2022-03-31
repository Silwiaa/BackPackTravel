package com.backpacktravel.service;

import com.backpacktravel.domain.AirportDto;
import com.backpacktravel.domain.DestinationDto;
import com.backpacktravel.domain.FlightDto;
import com.backpacktravel.skyscanner.SkyscannerClient;
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

    public FlightDto fetchSkyscannerFlights(DestinationDto destinationDto) {
        return skyscannerClient.getFlight(destinationDto.getAdults(), destinationDto.getOrigin(), destinationDto.getDestination(), destinationDto.getData(), destinationDto.getCurrency());
    }
}
