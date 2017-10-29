package pl.coderslab.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {
	@RequestMapping("/showRandom")
	@ResponseBody
	public String showRandom() {
		return "Wylosowano liczbe dupa :" + (new Random().nextInt(100) + 1);
	}
}
