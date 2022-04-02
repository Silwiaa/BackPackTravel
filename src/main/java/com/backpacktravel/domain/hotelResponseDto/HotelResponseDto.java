package com.backpacktravel.domain.hotelResponseDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelResponseDto {

    @JsonProperty("hotels")
    private List<HotelDto> hotels;

    @JsonProperty("nightsForPrice")
    private String nightsForPrice;

    @JsonProperty("closedUserGroupDeals")
    private String[] closedUserGroupDeals;

    @JsonProperty("pricePolicy")
    private String pricePolicy;

    @JsonProperty("entity")
    private EntityDto entity;

    @JsonProperty("location")
    private List<LocationDto> location;

    @JsonProperty("priceType")
    private String priceType;

    @JsonProperty("localCurrency")
    private String localCurrency;

    @JsonProperty("totalHotels")
    private int totalHotels;

    @JsonProperty("totalHotelsFiltered")
    private int totalHotelsFiltered;

    @JsonProperty("partners")
    private List<String> partners;

    @JsonProperty("requestId")
    private String requestId;

    @JsonProperty("searchByCurrentLocation")
    private boolean searchByCurrentLocation;

    @JsonProperty("context")
    private ContextDto context;
}
