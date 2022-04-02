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
public class ParentDto {

    @JsonProperty("flightPlaceId")
    private String flightPlaceId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;
}
