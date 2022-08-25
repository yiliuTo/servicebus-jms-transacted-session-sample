package com.example.servicebus.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class ForwardSendToService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ForwardTemplateService.class);

	private static final String QUEUE_THREE = "que003";
	private static final String QUEUE_FOUR = "que004";

	@JmsListener(destination = QUEUE_THREE, containerFactory = "jmsListenerContainerFactory")
	@SendTo(QUEUE_FOUR)
	public void receive(String message) {
		LOGGER.info("Message received: {}", message);
	}
}
