package com.example.Zajecia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.BikeRentApi;
import io.swagger.client.model.BikeRentCreateRequest;
import io.swagger.client.model.BikeRentResponse;
import org.threeten.bp.OffsetDateTime;

import java.util.UUID;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);
	}
}

