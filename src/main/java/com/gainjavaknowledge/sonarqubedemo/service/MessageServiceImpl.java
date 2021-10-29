package com.gainjavaknowledge.sonarqubedemo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {

	public String getMessage() {
		String str = " gain java knowledge";
		Object obj = getObject();
		System.out.println(obj.toString());
		return str;
	}

	private Object getObject() {
		return "abc";
	}

}
