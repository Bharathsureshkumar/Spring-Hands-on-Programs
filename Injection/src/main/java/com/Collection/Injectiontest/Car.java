package com.Collection.Injectiontest;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Car implements VehicleInterface{
	
static int count;
	int localCount;
	
	Car(){
		localCount = ++count;
	}
	
	
	@Override
	public String accelerate() {
		
		return "Car Moving forward .. !";
	}

	@Override
	public String stop() {
		
		return "Car Stopped .. !";
	}
	
}
