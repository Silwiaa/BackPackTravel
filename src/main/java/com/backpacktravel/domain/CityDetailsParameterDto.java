package com.backpacktravel.domain;

import com.backpacktravel.domain.cityResponseDto.CityDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class CityDetailsParameterDto {
    private List<Map<String,String>> cities;
    private List<String> currencies;
}


