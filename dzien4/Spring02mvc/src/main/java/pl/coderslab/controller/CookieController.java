package pl.coderslab.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

@Controller
public class CookieController {
	@RequestMapping("/setcookie/{value1}/{value2}")
	@ResponseBody
	public String setcookie(HttpServletResponse response, 
			@PathVariable("value1") String value1, 
			@PathVariable("value2") String value2){
		Cookie c1 = new Cookie("cookie1" , value1);
		c1.setPath("/");
		c1.setMaxAge(1000);
		Cookie c2 = new Cookie("cookie2" , value2);
		c2.setPath("/");
		c2.setMaxAge(1000);
		
		response.addCookie(c1);
		response.addCookie(c2);
		return "dodano ciasteczka";
	}
	
//	@RequestMapping("/getcookies")
//	@ResponseBody
//	public String getcookies(@CookieValue("cookie1") String cookie1, @CookieValue("cookie2") String cookie2) {
//		return "cookie1: " + cookie1 + ", cookie2: " + cookie2;
//		
//	}
	
	@RequestMapping("/getcookies")
	@ResponseBody
	public String getcookies(HttpServletRequest request) {
		
		Cookie c1 = WebUtils.getCookie(request, "cookie1");
		Cookie c2 = WebUtils.getCookie(request, "cookie2");
		
		return "cookie1: " + c1.getValue() + ", cookie2: " + c2.getValue();
		
	}
}
