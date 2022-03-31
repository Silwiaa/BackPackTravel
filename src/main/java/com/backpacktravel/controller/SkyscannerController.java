package com.backpacktravel.controller;

import com.backpacktravel.domain.AirportDto;
import com.backpacktravel.domain.DestinationDto;
import com.backpacktravel.domain.FlightDto;
import com.backpacktravel.skyscanner.facade.SkyscannerFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
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

    @GetMapping(value = "/getFlight")
    public ResponseEntity<FlightDto> getSkyskannerFlight(@RequestBody DestinationDto destinationDto) {
        return ResponseEntity.ok(skyscannerFacade.fetchSkyscannerFlight(destinationDto));
    }
}
