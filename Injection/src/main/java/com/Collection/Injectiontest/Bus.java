package com.Collection.Injectiontest;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bus implements VehicleInterface{

	static int count;
	int localCount;
	
	Bus(){
		localCount = ++count;
	}
	
	
	@Override
	public String accelerate() {
		
		return "Bus Moving forward .. !";
	}

	@Override
	public String stop() {
		
		return "Bus Stopped .. !";
	}
	
}
