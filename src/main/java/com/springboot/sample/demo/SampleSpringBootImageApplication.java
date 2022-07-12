package com.springboot.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleSpringBootImageApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello " +System.getenv("GREETED_USER")+" !!! Welcome to "+ System.getenv("GREETING_APPLICATION");
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootImageApplication.class, args);
	}

}
