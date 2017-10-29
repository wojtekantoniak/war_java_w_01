package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
}