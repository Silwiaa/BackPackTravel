package com.backpacktravel.controller.hotel;

import com.backpacktravel.client.hotel.BookingClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/booking")
@RequiredArgsConstructor
public class Booking {
    private final BookingClient bookingClient;

    @GetMapping
    public void getBookingLocation() throws IOException, InterruptedException {
        bookingClient.getDestinations();
    }
}
