package com.arun.devopspoc.controller;

import junit.framework.TestCase;
import com.arun.devopspoc.model.Message;
import com.arun.devopspoc.controller.MessageController;
import org.junit.Test;

public class MessageControllerTest extends TestCase
{
	public Message m = null;
	public MessageController mc = null;

	protected void setUp() throws Exception {
		m = new Message();
		m.setMessage("Arun");
		mc = new MessageController();
	}	

	@Test
	public void testPrintMessage() {
		assertEquals(mc.printMessage(m), "Message : Arun");
	}

	protected void tearDown() throws Exception {
		m = null;
		mc = null;
	}
}
