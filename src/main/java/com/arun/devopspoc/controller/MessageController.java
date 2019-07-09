package com.arun.devopspoc.controller;

import com.arun.devopspoc.model.Message;

public class MessageController {
	public String printMessage(Message m) {
		return String.valueOf("Message : "+ m.getMessage());
	}
}
