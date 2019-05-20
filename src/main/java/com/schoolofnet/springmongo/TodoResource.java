package com.schoolofnet.springmongo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoResource {

	@GetMapping("/hello")
	public String helloTodos() {
		return "Custom Route from Todos path";
	}
}
