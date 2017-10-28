package pl.coderslab.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.coderslab.bean.Component1;
import pl.coderslab.bean.Component2;

@Configuration
public class Config {
	
	@Bean
	public Component2 component2() {
		return new Component2();
	}
	
	@Bean
	public Component1 component1() {
		return new Component1(component2());
	}
}
