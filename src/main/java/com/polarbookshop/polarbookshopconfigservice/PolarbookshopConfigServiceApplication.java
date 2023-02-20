package com.polarbookshop.polarbookshopconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PolarbookshopConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolarbookshopConfigServiceApplication.class, args);
	}

}
