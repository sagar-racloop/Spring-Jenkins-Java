package com.example.SpringJenkinsProject;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsProjectApplicationTests {
	public static Logger logger= (Logger) LoggerFactory.getLogger(SpringJenkinsProjectApplication.class);


	@Test
	void contextLoads() {

		logger.info("Test Case Executing");

		assertEquals(true,true);
	}

}



