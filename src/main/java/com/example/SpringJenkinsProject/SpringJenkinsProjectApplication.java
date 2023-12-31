package com.example.SpringJenkinsProject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsProjectApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsProjectApplication.class);


	@PostConstruct
	public void intt(){
		logger.info("Application Started ...");
	}





	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsProjectApplication.class, args);
		logger.info("Application executed ...");


	}

}