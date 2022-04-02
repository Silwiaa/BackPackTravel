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
public class AgentDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("is_carrier")
    private boolean is_carrier;

    @JsonProperty("update_status")
    private String update_status;

    @JsonProperty("optimised_for_mobile")
    private boolean optimised_for_mobile;

    @JsonProperty("live_update_allowed")
    private boolean live_update_allowed;
}
