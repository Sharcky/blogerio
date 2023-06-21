package com.github.sharcky.blogerio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BlogerioApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(BlogerioApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BlogerioApplication.class, args);
	}

	public void runner(String... args){
		LOGGER.info("Application has been stated!");
	}

}
