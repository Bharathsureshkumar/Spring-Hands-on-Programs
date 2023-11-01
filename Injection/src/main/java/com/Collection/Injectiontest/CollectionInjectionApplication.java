package com.Collection.Injectiontest;


import java.util.StringJoiner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CollectionInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CollectionInjectionApplication.class, args);

		context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		context.getBean(BeanPostProcessorClass.class);
		Vehicles vehicles = context.getBean(Vehicles.class);
		
		StringJoiner joiner = new StringJoiner(" | ", "\n[","]\n");


		vehicles.getBikes().stream().forEach(e -> {
			joiner.add(e.localCount+"");
			joiner.add(e.accelerate().toString());
			joiner.add(e.stop().toString());
		});
		System.out.println(joiner);
		joiner.setEmptyValue("");

		vehicles.getCars().stream().forEach(
				e-> {
					joiner.add(e.localCount + "");
					joiner.add(e.accelerate().toString());
					joiner.add(e.stop().toString());
				}
		);
		System.out.println(joiner);
		joiner.setEmptyValue("");

		vehicles.getBuses().entrySet().stream().forEach(
				e-> {
					joiner.add(e.getValue().localCount + "");
					joiner.add(e.getValue().accelerate().toString());
					joiner.add(e.getValue().stop().toString());
				}
		);
		System.out.println(joiner);
		
	}

}
