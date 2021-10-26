package com.gainjavaknowledge.sonarqubedemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gainjavaknowledge.sonarqubedemo.controller.MessageController;

@SpringBootTest
class SonarqubeDemoApplicationTests {

	@Autowired
	private MessageController messageController;

	@Test
	void contextLoads() {
		String input = "abc";
		Assertions.assertNotNull(input);
	}

	@Test
	void testGetMessage() {
		String input = "abc";
		String message = messageController.getMessage(input);
		Assertions.assertNotNull(message);
	}

}
