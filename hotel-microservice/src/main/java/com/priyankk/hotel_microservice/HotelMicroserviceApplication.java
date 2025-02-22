package com.priyankk.hotel_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMicroserviceApplication.class, args);
	}

}
