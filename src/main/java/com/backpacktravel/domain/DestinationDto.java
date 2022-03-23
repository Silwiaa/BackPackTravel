package com.backpacktravel.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DestinationDto {
    @JsonProperty("dest_id")
    private String dest_id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("city_name")
    private String city_name;

    @JsonProperty("country")
    private String Germany;

    @JsonProperty("dest_type")
    private String dest_type;

    @JsonProperty("nr_hotels")
    private int nr_hotels;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("latitude")
    private double latitude;
}
