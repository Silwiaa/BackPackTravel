package com.backpacktravel.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
@AllArgsConstructor
@NoArgsConstructor
public class CitiesCostOfLivingConfig {

    @Value("${citiescostofliving.api.endpoint}")
    private String citiesCostOfLivingApiEndpoint;

    @Value("${citiescostofliving.app.host}")
    private String citiesCostOfLivingHost;

    @Value("${citiescostofliving.app.key}")
    private String citiesCostOfLivingKey;

    @Value("${citiescostofliving.app.contentType}")
    private String citiesCostOfLivingContentType;
}
