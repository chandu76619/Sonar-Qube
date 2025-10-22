package com.greet.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "WELCOMEAPISERVICE")
public interface WelcomeApiFeignClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}