package com.gainjavaknowledge.sonarqubedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gainjavaknowledge.sonarqubedemo.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@GetMapping("/{message}")
	public String getMessage(@PathVariable("message") String message) {
		return messageService.getMessage(message);
	}
}
