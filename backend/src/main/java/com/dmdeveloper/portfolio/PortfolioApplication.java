package com.dmdeveloper.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	public String PORT = System.getenv("PORT");
	
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

}
