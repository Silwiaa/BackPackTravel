package com.backpacktravel.skyscanner;

import com.backpacktravel.configuration.SkyscannerConfig;
import com.backpacktravel.domain.AirportDto;
import com.backpacktravel.domain.FlightDto;
import com.backpacktravel.builder.Url;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.*;
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

    public FlightDto getFlight(int adults, String origin, String destination, String date, String currency) {

        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(skyscannerConfig.getSkyscannerApiEndpoint())
                .value("/search?")
                .queryParams("adults=", Integer.toString(adults))
                .queryParams("&origin=", origin)
                .queryParams("&destination=", destination)
                .queryParams("&departureDate=", date)
                .queryParams("&currency=", currency)
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key");

        try {
            ResponseEntity<FlightDto> response = restTemplate.exchange(url, HttpMethod.GET, request, FlightDto.class);
            return response.getBody();

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RestClientException(e.getMessage());
        }
    }

    private HttpEntity createRequest(String host, String name) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set(host, skyscannerConfig.getSkyscannerHost());
        headers.set(name, skyscannerConfig.getSkyscannerKey());

        return new HttpEntity(headers);
    }
}
