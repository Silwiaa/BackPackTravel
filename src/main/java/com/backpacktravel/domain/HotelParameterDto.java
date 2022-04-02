package com.backpacktravel.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HotelParameterDto {
    private int locationId;
    private int adults;
    private int rooms;
    private String checkIn;
    private String checkOut;
    private String currency;
}
