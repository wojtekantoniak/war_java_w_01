package pl.coderslab.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.coderslab.bean.HelloWorld;

@Configuration
public class AppConfig {
	@Bean
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("heloł!");
		return helloWorld;
	}
}
