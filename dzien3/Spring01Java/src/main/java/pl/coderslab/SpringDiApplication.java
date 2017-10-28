package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.coderslab.bean.Component1;
import pl.coderslab.bean.Component2;
import pl.coderslab.bean.HelloWorld;
import pl.coderslab.bean.Scope1;
import pl.coderslab.bean.Scope2;
import pl.coderslab.configuration.AppConfig;

public class SpringDiApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 HelloWorld hell = context.getBean("helloWorld", HelloWorld.class);
		 hell.getMessage();

		 Component1 com1 = context.getBean("component1", Component1.class);
		 System.out.println(com1.getOi());

		Scope1 scope1 = context.getBean(Scope1.class);
		System.out.println(scope1);
		Scope1 scope11 = context.getBean(Scope1.class);
		System.out.println(scope11);
		Scope2 scope2 = context.getBean(Scope2.class);
		System.out.println(scope2);
		Scope2 scope22 = context.getBean(Scope2.class);
		System.out.println(scope22);

		context.close();
	}
}
