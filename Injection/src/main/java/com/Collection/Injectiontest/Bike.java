package com.Collection.Injectiontest;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bike implements VehicleInterface, InitializingBean, DisposableBean {

	static int count;
	int localCount;
	
	Bike(){

		System.out.println("Bike Constructor Called.. !");
		localCount = ++count;
	}
	
	@Override
	public String accelerate() {
		
		return "Bike Moving forward .. !";
	}

	@Override
	public String stop() {
		
		return "Bike Stopped .. !";
	}



	@Override
	public void afterPropertiesSet() throws Exception{

		System.out.println("From Bike [Init] Method .. !");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("From Bike [Destroy] Method .. !");
	}


}
