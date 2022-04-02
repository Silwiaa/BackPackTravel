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
public class SkyscannerConfig {

    @Value("${skyscanner.api.endpoint}")
    private String skyscannerApiEndpoint;

    @Value("${skyscanner.app.host}")
    private String skyscannerHost;

    @Value("${skyscanner.app.key}")
    private String skyscannerKey;
}
