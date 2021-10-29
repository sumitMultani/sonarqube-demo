package com.gainjavaknowledge.sonarqubedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gainjavaknowledge.sonarqubedemo.service.MessageServiceImpl;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageServiceImpl service;
	 
	@GetMapping("/")
	public String getMessage() {
		return service.getMessage();
	}
}
