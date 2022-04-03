package com.backpacktravel.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CityDetailsByCoordinatesParameterDto {
    private double latitude;
    private double longitude;
    private List<String> currencies;
}
