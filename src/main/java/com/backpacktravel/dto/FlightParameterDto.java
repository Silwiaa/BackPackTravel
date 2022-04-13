package com.backpacktravel.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FlightParameterDto {
    private int adults;
    private String origin;
    private String destination;
    private String data;
    private String currency;
}
