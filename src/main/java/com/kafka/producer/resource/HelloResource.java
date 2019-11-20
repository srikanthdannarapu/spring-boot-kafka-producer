package com.kafka.producer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sreekanth
 *
 */
@RestController
@RequestMapping("hello")
public class HelloResource {
	@Autowired
	private KafkaTemplate<String, Object> template;

	private String topic = "SRI_TOPIC";
	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name) {
		template.send(topic, "Hi " + name + " greetings!!");
		return "Data published";
	}
}
