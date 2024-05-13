package it.epicode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		var ctx = new AnnotationConfigApplicationContext(MyAppConfig.class);
		var menu = (Menu)ctx.getBean("menu");
		System.out.println(menu);




	}
}
