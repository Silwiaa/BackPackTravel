package com.backpacktravel.domain.flightResponseDto.flightDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PricingOptionsDto {

    @JsonProperty("agents")
    private List<AgentDto> agents;

    @JsonProperty("price")
    private Map<String, String> price;
}
