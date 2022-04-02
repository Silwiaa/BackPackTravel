package com.backpacktravel.domain.hotelResponseDto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtherRatesDto {

    @JsonProperty("partnerId")
    private String partnerId;

    @JsonProperty("partnerName")
    private String partnerName;

    @JsonProperty("rawPrice")
    private int rawPrice;

    @JsonProperty("price")
    private String price;
}
