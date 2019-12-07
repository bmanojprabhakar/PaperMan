package com.paperman.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	@GetMapping
	public String sayHello() {
		return "Hello!! Spring boot setup is done";
	}

}
