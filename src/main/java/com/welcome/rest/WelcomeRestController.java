package com.welcome.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.welcome.client.GreetApiClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetApiClient greetClient;

	@GetMapping("/welcome")
	public String welcomeMsg() {

		String welcomeMsg = "Welcome to WELCOME API!!";

		String greetMsg = greetClient.invokeGreetApi();

		return greetMsg + ", " + welcomeMsg;
	}
}
