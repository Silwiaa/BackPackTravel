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
public class ReviewSummaryDto {

    @JsonProperty("description")
    private String description;

    @JsonProperty("count")
    private int count;

    @JsonProperty("formatCount")
    private String formatCount;

    @JsonProperty("value")
    private String value;

    @JsonProperty("formatValue")
    private String formatValue;

    @JsonProperty("color")
    private String color;

    @JsonProperty("taImage")
    private String taImage;
}
