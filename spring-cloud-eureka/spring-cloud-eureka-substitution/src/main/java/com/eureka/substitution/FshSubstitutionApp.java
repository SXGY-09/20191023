package com.eureka.substitution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class FshSubstitutionApp{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FshSubstitutionApp.class, args);
	}
}