package com.backpacktravel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightDto {

    @JsonProperty("itineraries")
    private ItineraryDto itineraryDto;

    @JsonProperty("context")
    private ContexDto contexDto;
}
