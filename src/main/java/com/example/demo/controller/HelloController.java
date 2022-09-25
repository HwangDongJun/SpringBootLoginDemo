package com.example.demo.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HelloController {
	// 화면에 helloworld 출력
	@GetMapping(value = "/helloworld/string")
	@ResponseBody
	public String helloworldString() {
		return "helloworld";
	}

	// 화면에 {message:"helloworld"}라고 출력
	@GetMapping(value = "/helloworld/json")
	@ResponseBody
	public Hello helloworldJson() {
		Hello hello = new Hello();
		hello.message = "helloworld";
		return hello;
	}

	@Setter
	@Getter
	public static class Hello {
		private String message;
	}
}