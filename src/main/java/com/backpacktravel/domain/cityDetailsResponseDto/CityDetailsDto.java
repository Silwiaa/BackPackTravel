package com.backpacktravel.domain.cityDetailsResponseDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityDetailsDto {

    @JsonProperty("cost_of_living_details")
    private List<CostOfLivingDto> cost_of_living_details;

    @JsonProperty("cost_of_living_index")
    private String cost_of_living_index;

    @JsonProperty("cost_of_living_plus_rent_index")
    private String cost_of_living_plus_rent_index;

    @JsonProperty("country")
    private String country;

    @JsonProperty("groceries_index")
    private String groceries_index;

    @JsonProperty("last_updated_timestamp")
    private String last_updated_timestamp;

    @JsonProperty("local_purchasing_power_index")
    private String local_purchasing_power_index;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rent_index")
    private String rent_index;

    @JsonProperty("restaurant_price_index")
    private String restaurant_price_index;

    @JsonProperty("us_state")
    private String us_state;
}
