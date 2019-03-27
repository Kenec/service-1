package com.example.r42;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SuchController {

	@Value("${suchname}") private String suchName;

	@RequestMapping("/hello")
	public String suchHello(){

		String azUrl = "http://169.254.169.254/latest/meta-data/placement/availability-zone";
		String timeUrl = System.getenv("TIME_URL") + ":" + System.getenv("TIME_PORT");
		RestTemplate restTemplate = new RestTemplate();

		String result = restTemplate.getForObject(timeUrl, String.class);
		String azName = restTemplate.getForObject(azUrl, String.class);

		return "Hello " + azName + " " + result;
	}
}
