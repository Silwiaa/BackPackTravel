package com.backpacktravel.domain.flightResponseDto.bestFlightDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketingDto {

    @JsonProperty("id")
    private int id;

    @JsonProperty("logoUrl")
    private String logoUrl;

    @JsonProperty("name")
    private String name;
}
