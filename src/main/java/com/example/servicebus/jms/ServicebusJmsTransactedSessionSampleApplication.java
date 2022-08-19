package com.example.servicebus.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ServicebusJmsTransactedSessionSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicebusJmsTransactedSessionSampleApplication.class, args);
	}

}
