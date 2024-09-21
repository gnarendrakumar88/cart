package com.shoppy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class CartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}
	
	@Value("${server.port}")
	private int port;
	
	@RequestMapping("/hi")
	public String hi(){
		return "Hi";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello" + port;
	}

}
