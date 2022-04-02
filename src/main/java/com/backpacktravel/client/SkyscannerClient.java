package com.backpacktravel.client;

import com.backpacktravel.builder.Url;
import com.backpacktravel.configuration.SkyscannerConfig;
import com.backpacktravel.domain.FlightParameterDto;
import com.backpacktravel.domain.HotelParameterDto;
import com.backpacktravel.domain.RentACarParameterDto;
import com.backpacktravel.domain.airportDto.AirportDto;
import com.backpacktravel.domain.flightResponseDto.FlightResponseDto;
import com.backpacktravel.domain.flightResponseDto.bestFlightDto.BestFlightDto;
import com.backpacktravel.domain.flightResponseDto.flightDto.FlightDto;
import com.backpacktravel.domain.hotelResponseDto.HotelResponseDto;
import com.backpacktravel.domain.locationHotelDto.LocationHotelDto;
import com.backpacktravel.domain.locationRentACar.LocationRentACarDto;
import com.backpacktravel.domain.rentACarResponseDto.RentACarResponseDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class SkyscannerClient {

    private final RestTemplate restTemplate;
    private final SkyscannerConfig skyscannerConfig;
    private static final Logger LOGGER = LoggerFactory.getLogger(SkyscannerClient.class);

    public List<AirportDto> getAirport(String destination) {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(skyscannerConfig.getSkyscannerApiEndpoint())
                .value("/autocomplete?")
                .queryParams("query=", destination)
                .build();

        String url = urlService.toString();
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key");

        try {
            ResponseEntity<AirportDto[]> response = restTemplate.exchange(url, HttpMethod.GET, request, AirportDto[].class);
            return Optional.ofNullable(response)
                    .map(Arrays::asList)
                    .orElse(Collections.emptyList())
                    .stream()
                    .flatMap(p -> Arrays.stream(p.getBody()))
                    .collect(Collectors.toList());

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            return Collections.emptyList();
        }
    }

    public FlightResponseDto getFlight(FlightParameterDto destinationDto, boolean isBest) {
        final String value = isBest == true ? "/search?" : "/search-extended?";
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(skyscannerConfig.getSkyscannerApiEndpoint())
                .value(value)
                .queryParams("adults=", Integer.toString(destinationDto.getAdults()))
                .queryParams("&origin=", destinationDto.getOrigin())
                .queryParams("&destination=", destinationDto.getDestination())
                .queryParams("&departureDate=", destinationDto.getData())
                .queryParams("&currency=", destinationDto.getCurrency())
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key");

        try {
            if(isBest) {
                ResponseEntity<BestFlightDto> response = restTemplate.exchange(url, HttpMethod.GET, request, BestFlightDto.class);
                System.out.println(response);
                return response.getBody();
            } else {
                ResponseEntity<FlightDto> response = restTemplate.exchange(url, HttpMethod.GET, request, FlightDto.class);
                System.out.println(response);
                return response.getBody();
            }

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RestClientException(e.getMessage());
        }
    }

    public List<LocationHotelDto> getLocationsHotel(String location) {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(skyscannerConfig.getSkyscannerApiEndpoint())
                .value("/autocomplete-hotel?")
                .queryParams("query=", location)
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key");

        try {
            ResponseEntity<LocationHotelDto[]> response = restTemplate.exchange(url, HttpMethod.GET, request, LocationHotelDto[].class);
            System.out.println(response);
            return Optional.ofNullable(response)
                    .map(Arrays::asList)
                    .orElse(Collections.emptyList())
                    .stream()
                    .flatMap(p -> Arrays.stream(p.getBody()))
                    .collect(Collectors.toList());

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            return Collections.emptyList();
        }
    }

    public HotelResponseDto getHotel(HotelParameterDto hotelParameterDto) {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(skyscannerConfig.getSkyscannerApiEndpoint())
                .value("/search-hotel?")
                .queryParams("locationId=", Integer.toString(hotelParameterDto.getLocationId()))
                .queryParams("&adults=", Integer.toString(hotelParameterDto.getAdults()))
                .queryParams("&rooms=", Integer.toString(hotelParameterDto.getRooms()))
                .queryParams("&checkin=", hotelParameterDto.getCheckIn())
                .queryParams("&checkout=", hotelParameterDto.getCheckOut())
                .queryParams("&currency=", hotelParameterDto.getCurrency())
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key");

        try {
            ResponseEntity<HotelResponseDto> response = restTemplate.exchange(url, HttpMethod.GET, request, HotelResponseDto.class);
            System.out.println(response);
            return response.getBody();

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RestClientException(e.getMessage());
        }
    }

    public List<LocationRentACarDto> getLocationsRentACar(String location) {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(skyscannerConfig.getSkyscannerApiEndpoint())
                .value("/autocomplete-rentacar?")
                .queryParams("query=", location)
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key");

        try {
            ResponseEntity<LocationRentACarDto[]> response = restTemplate.exchange(url, HttpMethod.GET, request, LocationRentACarDto[].class);
            System.out.println(response);
            return Optional.ofNullable(response)
                    .map(Arrays::asList)
                    .orElse(Collections.emptyList())
                    .stream()
                    .flatMap(p -> Arrays.stream(p.getBody()))
                    .collect(Collectors.toList());

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            return Collections.emptyList();
        }
    }

    public RentACarResponseDto getRentACar(RentACarParameterDto rentACarParameterDto) {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(skyscannerConfig.getSkyscannerApiEndpoint())
                .value("/search-rentacar?")
                .queryParams("pickupId=", Integer.toString(rentACarParameterDto.getPickupId()))
                .queryParams("&pickupDate=", rentACarParameterDto.getPickupDate().toString())
                .queryParams("&pickupTime=", rentACarParameterDto.getPickupTime().toString())
                .queryParams("&returnDate=", rentACarParameterDto.getReturnDate().toString())
                .queryParams("&returnTime=", rentACarParameterDto.getReturnTime().toString())
                .queryParams("&currency=", rentACarParameterDto.getCurrency())
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key");

        try {
            ResponseEntity<RentACarResponseDto> response = restTemplate.exchange(url, HttpMethod.GET, request, RentACarResponseDto.class);
            System.out.println(response.getBody());
            return response.getBody();

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RestClientException(e.getMessage());
        }
    }

    private HttpEntity createRequest(String host, String key) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set(host, skyscannerConfig.getSkyscannerHost());
        headers.set(key, skyscannerConfig.getSkyscannerKey());

        return new HttpEntity(headers);
    }
}
