package com.example.jenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsApplicationTests {
	private static Logger log = (Logger) LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Testcase  executing ....");
		assertEquals(true,true);
	}

}
