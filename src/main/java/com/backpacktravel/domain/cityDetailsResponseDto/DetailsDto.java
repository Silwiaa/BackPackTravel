package com.backpacktravel.domain.cityDetailsResponseDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailsDto {

    @JsonProperty("Item")
    private String item;

    @JsonProperty("Range")
    private String range;

    @JsonProperty("Value")
    private String value;
}
