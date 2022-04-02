package com.backpacktravel.domain.flightResponseDto.flightDto;

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

    @JsonProperty("status")
    private String status;

    @JsonProperty("sessionId")
    private String sessionId;
}
