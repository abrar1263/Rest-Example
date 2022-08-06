package com.perfectsquare.Restexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

	@GetMapping("/hello.{name}")
	public String hello(@PathVaribale String name) {
		return "Welcome "+name;
	}
}
