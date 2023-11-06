package com.custom.eventlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EventlistenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventlistenerApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EventlistenerApplication.class);
		
		
		
		UserDefinedApplicationEventPublisher listener = (UserDefinedApplicationEventPublisher)context.getBean(UserDefinedApplicationEventPublisher.class);
		
		listener.publish();
	}

}
