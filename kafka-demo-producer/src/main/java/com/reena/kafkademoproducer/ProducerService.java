package com.reena.kafkademoproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.reena.model.User;

@Service
public class ProducerService {
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	public void producer(User user) {
		System.out.println("Producing the message:"+user);
		kafkaTemplate.send("demo-topic",user);
	}
}
