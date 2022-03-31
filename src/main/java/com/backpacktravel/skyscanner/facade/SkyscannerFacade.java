package com.backpacktravel.skyscanner.facade;

import com.backpacktravel.domain.AirportDto;
import com.backpacktravel.domain.DestinationDto;
import com.backpacktravel.domain.FlightDto;
import com.backpacktravel.service.SkyscannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class SkyscannerFacade {

    private final SkyscannerService skyscannerService;

    public List<AirportDto> fetchSkyscannerAirports(String airport) {
        List<AirportDto> skyscannerAirports = skyscannerService.fetchSkyscannerAirports(airport);
        System.out.println(skyscannerAirports);
        return skyscannerAirports;
    }

    public FlightDto fetchSkyscannerFlight(DestinationDto destinationDto) {
        FlightDto skyscannerFlight = skyscannerService.fetchSkyscannerFlights(destinationDto);
        return skyscannerFlight;
    }
}