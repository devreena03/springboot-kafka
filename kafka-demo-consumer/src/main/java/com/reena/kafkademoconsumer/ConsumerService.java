package com.reena.kafkademoconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.reena.model.User;

@Service
public class ConsumerService {

	@KafkaListener(topics="demo-topic", groupId="message-id2")
	public void consumer(User user) {
		System.out.println("Consumed : "+user);
	}
}
