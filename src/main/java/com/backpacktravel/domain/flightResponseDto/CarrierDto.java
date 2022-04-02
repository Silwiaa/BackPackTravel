package com.backpacktravel.domain.flightResponseDto;

import com.backpacktravel.domain.flightResponseDto.bestFlightDto.MarketingDto;
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
public class CarrierDto {

    @JsonProperty("marketing")
    private List<MarketingDto> marketingDto;

    @JsonProperty("operationType")
    private String operationType;
}
