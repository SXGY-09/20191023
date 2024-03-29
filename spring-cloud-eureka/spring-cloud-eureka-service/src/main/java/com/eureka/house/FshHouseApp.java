package com.eureka.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class FshHouseApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FshHouseApp.class, args);
	}
}
