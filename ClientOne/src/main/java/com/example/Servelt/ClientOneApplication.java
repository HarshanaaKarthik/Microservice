package com.example.Servelt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.example.controller"})
public class ClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientOneApplication.class, args);
	}

}
