package com.gainjavaknowledge.sonarqubedemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gainjavaknowledge.sonarqubedemo.controller.MessageController;

@SpringBootTest
class SonarqubeDemoApplicationTests {

	@Autowired
	private MessageController controller;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testGetMessage() {
		String message = controller.getMessage();
		Assertions.assertNotNull(message);
	}
}
