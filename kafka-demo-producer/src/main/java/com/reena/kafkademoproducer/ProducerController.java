package com.reena.kafkademoproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reena.model.User;

@RestController
public class ProducerController {
	
	@Autowired
	private ProducerService service;
	
	@GetMapping("/generate")
	public String generate(@RequestParam String name, @RequestParam int age) {
		service.producer(new User(name, age));
		return "OK";
	}

}
