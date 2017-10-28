package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.coderslab.bean.EmailService;
import pl.coderslab.bean.HelloWorld;
import pl.coderslab.bean.MessageSender;
import pl.coderslab.bean.MessageService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
		// obj.getMessage();
		MessageSender sender = context.getBean("messageSender", MessageSender.class);
		sender.sendMessage();

		context.close();
		
//		MessageService messageService = new EmailService();
//		MessageSender messageSender = new MessageSender(messageService);
//		messageSender.setMessage("druga wiadomosc");
//		messageSender.sendMessage();
	}
}
