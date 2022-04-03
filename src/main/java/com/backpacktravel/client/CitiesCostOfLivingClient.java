package com.backpacktravel.client;

import com.backpacktravel.builder.Url;
import com.backpacktravel.configuration.CitiesCostOfLivingConfig;
import com.backpacktravel.domain.CityDetailsByCoordinatesParameterDto;
import com.backpacktravel.domain.cityDetailsResponseDto.CityDetailsResponseDto;
import com.backpacktravel.domain.cityResponseDto.CityResponseDto;
import com.backpacktravel.domain.currencyResponseDto.CurrencyResponseDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
@RequiredArgsConstructor
public class CitiesCostOfLivingClient {

    private final RestTemplate restTemplate;
    private final CitiesCostOfLivingConfig citiesCostOfLivingConfig;
    private static final Logger LOGGER = LoggerFactory.getLogger(SkyscannerClient.class);

    public CityResponseDto getCity() {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(citiesCostOfLivingConfig.getCitiesCostOfLivingApiEndpoint())
                .value("/get_cities_list")
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key", "");

        try {
            ResponseEntity<CityResponseDto> response = restTemplate.exchange(url, HttpMethod.GET, request, CityResponseDto.class);
            System.out.println(response);
            return response.getBody();

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RestClientException(e.getMessage());
        }
    }

    public CurrencyResponseDto getCurrency() {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(citiesCostOfLivingConfig.getCitiesCostOfLivingApiEndpoint())
                .value("/get_currencies_list")
                .build();

        String url = urlService.toString();
        System.out.println("Url: " + url);
        HttpEntity request = createRequest("X-RapidAPI-Host", "X-RapidAPI-Key", "");

        try {
            ResponseEntity<CurrencyResponseDto> response = restTemplate.exchange(url, HttpMethod.GET, request, CurrencyResponseDto.class);
            System.out.println(response);
            return response.getBody();

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RestClientException(e.getMessage());
        }
    }

    public CityDetailsResponseDto getCityDetailsByCoordinates(CityDetailsByCoordinatesParameterDto cityDetailsByCoordinatesParameterDto) {
        Url urlService = new Url.UrlBuilder()
                .apiEndpoint(citiesCostOfLivingConfig.getCitiesCostOfLivingApiEndpoint())
                .value("/get_cities_details_by_coordinates")
                .build();

        String url = urlService.toString();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("X-RapidAPI-Host", citiesCostOfLivingConfig.getCitiesCostOfLivingHost());
        headers.set("X-RapidAPI-Key", citiesCostOfLivingConfig.getCitiesCostOfLivingKey());

        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("latitude", Double.toString(cityDetailsByCoordinatesParameterDto.getLatitude()));
        params.add("longitude", Double.toString(cityDetailsByCoordinatesParameterDto.getLongitude()));
        params.add("currencies", cityDetailsByCoordinatesParameterDto.getCurrencies().get(0));

        System.out.println(params);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(params, headers);
        System.out.println(request);
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_FORM_URLENCODED));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        try {
            ResponseEntity<CityDetailsResponseDto> response = restTemplate.exchange(url, HttpMethod.POST, request, CityDetailsResponseDto.class);
            return response.getBody();

        } catch (RestClientException e) {
            LOGGER.error(e.getMessage(), e);
            throw new RestClientException(e.getMessage());
        }
    }

    private HttpEntity createRequest(String host, String key, String contentType) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        if (!contentType.isEmpty()) {
            headers.set(contentType, citiesCostOfLivingConfig.getCitiesCostOfLivingContentType());
        }
        headers.set(host, citiesCostOfLivingConfig.getCitiesCostOfLivingHost());
        headers.set(key, citiesCostOfLivingConfig.getCitiesCostOfLivingKey());
        return new HttpEntity(headers);
    }
}
