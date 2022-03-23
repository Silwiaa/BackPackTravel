package com.backpacktravel.configuration.hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
@AllArgsConstructor
@NoArgsConstructor
public class BookingConfig {
    @Value("${booking.api.endpoint}")
    private String bookingApiEndpoint;

    @Value("${booking.app.key}")
    private String bookingKey;
}
