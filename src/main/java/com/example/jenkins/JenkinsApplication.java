package com.example.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication {
	public static Logger log = (Logger) LoggerFactory.getLogger(JenkinsApplication.class);


	@PostConstruct
	public void init(){
		log.info("Application is starting");
	}

	public static void main(String[] args) {
		log.info("Application executed");
		log.info("Hi");

		SpringApplication.run(JenkinsApplication.class, args);
	}

}
