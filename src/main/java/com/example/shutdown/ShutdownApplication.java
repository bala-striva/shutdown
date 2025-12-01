package com.example.shutdown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class ShutdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShutdownApplication.class, args);
	}

}
