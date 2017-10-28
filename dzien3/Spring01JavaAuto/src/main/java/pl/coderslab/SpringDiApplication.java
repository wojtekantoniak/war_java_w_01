package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.coderslab.bean.Auto2;
import pl.coderslab.configuration.AppConfig;

public class SpringDiApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Auto2 auto = context.getBean("auto2", Auto2.class);
		System.out.println(auto.getAuto1().getClass().getName());
		context.close();
	}
}
