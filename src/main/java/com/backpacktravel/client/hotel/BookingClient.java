package com.backpacktravel.client.hotel;

import lombok.RequiredArgsConstructor;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@RequiredArgsConstructor
public class BookingClient {

    public void getDestinations() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://skyscanner44.p.rapidapi.com/autocomplete?query=berlin"))
                .header("X-RapidAPI-Host", "skyscanner44.p.rapidapi.com")
                .header("X-RapidAPI-Key", "2de85cd3d8msh4fec2c4b4b130a1p140066jsn1e65aa950817")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
