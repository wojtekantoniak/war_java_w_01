package pl.coderslab.bean;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	public void getMessage() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
	}
}
