package com.example.servicebus.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ForwardTemplateService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ForwardTemplateService.class);

	private static final String QUEUE_ONE = "que001";
	private static final String QUEUE_TWO = "que002";

	@Autowired
	private JmsTemplate jmsTemplate;

	@JmsListener(destination = QUEUE_ONE, containerFactory = "jmsListenerContainerFactory")
	public void receive(String message) {
		LOGGER.info("Message received: {}", message);
		jmsTemplate.convertAndSend(QUEUE_TWO, message);
	}
}
