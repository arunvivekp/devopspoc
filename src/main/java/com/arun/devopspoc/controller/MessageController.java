package com.arun.devopspoc.controller;

import com.arun.devopspoc.model.Message;

public class MessageController {
	public void printMessage(Message m) {
		System.out.println("Message : "+ m.getMessage());
	}
}
