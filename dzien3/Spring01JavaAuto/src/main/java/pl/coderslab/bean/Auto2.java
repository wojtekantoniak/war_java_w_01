package pl.coderslab.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Auto2 {
	
	@Autowired
	Auto1 auto1;
	
	public Auto1 getAuto1() {
		return auto1;
	}
}
