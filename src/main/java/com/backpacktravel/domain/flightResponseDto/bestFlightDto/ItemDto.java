package com.backpacktravel.domain.flightResponseDto.bestFlightDto;

import com.backpacktravel.domain.flightResponseDto.LegsDto;
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
public class ItemDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("price")
    private Map<String, String> price;

    @JsonProperty("legs")
    private List<LegsDto> legs;

    @JsonProperty("isSelfTransfer")
    private boolean isSelfTransfer;

    @JsonProperty("farePolicy")
    private FarePolicyDto farePolicy;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("isMashUp")
    private boolean isMashUp;

    @JsonProperty("hasFlexibleOptions")
    private boolean hasFlexibleOptions;

    @JsonProperty("score")
    private double score;
}
