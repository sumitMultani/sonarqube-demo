package com.gainjavaknowledge.sonarqubedemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gainjavaknowledge.sonarqubedemo.service.MessageService;

@Service
public class MessageSeerviceImpl implements MessageService{

	@Override
	public String getMessage(String message) {
 		return getMessage() + message;
	}

	private String getMessage() {
		String msg = "Welome to this channel ";
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		return msg + " gain";
	}
 
}
