package pl.coderslab.controller;

import java.util.Calendar;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
	@RequestMapping("/loginStart")
	@ResponseBody
	public String loginStart(HttpSession ses) {
		String sesMax = (String) ses.getAttribute("loginStart");
		if (sesMax != null) {
			return "Wartosc sesji: " + sesMax;
		}
		ses.setAttribute("loginStart", Calendar.getInstance().getTime().toString());
		return "nie ma";
	}
}
