package com.backpacktravel.domain;

import com.backpacktravel.domain.cityResponseDto.CityDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CityDetailsParameterDto {
    private List<CityDto> cities;
    private List<String> currencies;
}


