package pl.coderslab.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class RandomController {
	@RequestMapping("/")
	@ResponseBody
	public String showRandom() {
		return "Wylosowano liczbe dupa :" + (new Random().nextInt(100) + 1);
	}

	@RequestMapping("/random/{rand}")
	@ResponseBody
	public String random(@PathVariable("rand") int rand) {
		return "Uzytkownik podal wartosc: " + rand + " . Wylosowano liczbe: " + (new Random().nextInt(rand) + 1);
	}

	@RequestMapping("/random/{min}/{max}")
	@ResponseBody
	public String random2(@PathVariable("min") int min, @PathVariable("max") int max) {
		return "Uzytkownik podal wartosci: " + min + " i " + max + " . Wylosowano liczbe: "
				+ (min + new Random().nextInt(max + 1 - min));
	}

	@GetMapping("/form")
	public String form() {
		return "forms/form";
	}

	@ResponseBody
	@PostMapping("/form")
	public String form(@RequestParam("paramName") String paramName) {
		return "paramName: " + paramName;
	}

}
