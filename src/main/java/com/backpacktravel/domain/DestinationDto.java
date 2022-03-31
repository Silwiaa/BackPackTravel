package com.backpacktravel.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DestinationDto {
    private int adults;
    private String origin;
    private String destination;
    private String data;
    private String currency;
}
