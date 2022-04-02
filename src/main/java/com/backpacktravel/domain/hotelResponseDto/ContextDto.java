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
public class ContextDto {

    @JsonProperty("completionPercentage")
    private int completionPercentage;

    @JsonProperty("incomplete")
    private String incomplete;

    @JsonProperty("searchId")
    private String searchId;
}
