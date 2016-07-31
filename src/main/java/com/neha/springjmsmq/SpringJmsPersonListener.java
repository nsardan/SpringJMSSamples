package com.neha.springjmsmq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.listener.SessionAwareMessageListener;

public class SpringJmsPersonListener implements SessionAwareMessageListener{

	public void onMessage(Message message, Session session) throws JMSException {
		System.out.println("Message Received "+message.toString());  
		
	}

}
