package com.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String wishMsg() {
		return " <h1> Hello Friends my best is Manoj mera dhosth </h1>";
	}

}
