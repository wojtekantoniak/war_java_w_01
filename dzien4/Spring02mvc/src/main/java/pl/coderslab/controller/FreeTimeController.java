package pl.coderslab.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreeTimeController {
	@RequestMapping("/freeTime")
	@ResponseBody
	public String freeTime() {
		String status = "Wolne";
		Calendar c = Calendar.getInstance();
		if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && c.get(Calendar.DAY_OF_WEEK) 
				!= Calendar.SATURDAY) {
			if (c.get(Calendar.HOUR_OF_DAY) >= 9 && c.get(Calendar.HOUR_OF_DAY) < 17) {
				status = "Pracuje, nie dzwon";
			} else {
				status = "Po pracy";
			}
		}
		return status;
	}
}
