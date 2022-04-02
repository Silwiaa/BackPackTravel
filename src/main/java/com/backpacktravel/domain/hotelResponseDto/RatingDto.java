package com.backpacktravel.domain.hotelResponseDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingDto {

    @JsonProperty("description")
    private String description;

    @JsonProperty("count")
    private int count;

    @JsonProperty("value")
    private String value;

    @JsonProperty("color")
    private String colorKolkata;
}
