package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws InterruptedException {
		// give some time for the route to run and generate the native config
		Thread.sleep(2000);
	}

}
