package com.everspin.assignment.resultCollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResultCollectorApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ResultCollectorApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
