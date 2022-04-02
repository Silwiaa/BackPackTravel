package com.backpacktravel.domain.flightResponseDto.flightDto;

import com.backpacktravel.domain.flightResponseDto.LegsDto;
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
public class ResultDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("legs")
    private List<LegsDto> legs;

    @JsonProperty("pricing_options")
    private List<PricingOptionsDto> pricing_options;
}
