package com.aohys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MomoApplication {

	private static final Logger log = LoggerFactory.getLogger(MomoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MomoApplication.class, args);
	}

}
