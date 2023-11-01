package com.Collection.Injectiontest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.Collection.Injectiontest")
public class ConfigurationClass {
	
	@Autowired
	private ObjectFactory<Bike> bike;
	@Autowired
	private ObjectFactory<Car> car;
	@Autowired
	private ObjectFactory<Bus> bus;


//	@Bean
//	@Lazy
//	public Bike getBike(){
//		return new Bike();
//	}

	@Bean(name = "bikeBean")
	@Lazy
	public List<Bike> getBikes(){

		List<Bike> bikeList = new ArrayList<Bike>();
		  bikeList.add(bike.getObject());
		  bikeList.add(bike.getObject());
		  bikeList.add(bike.getObject());
		  bikeList.add(bike.getObject());


		return bikeList;

	}
	
	
	@Bean(name="carBean")
	@Lazy
	public Set<Car> getCars(){
		
		Set<Car> cars = new HashSet<Car>();
		
		  cars.add(car.getObject()); cars.add(car.getObject());
		  cars.add(car.getObject()); cars.add(car.getObject());

		return cars;
	}
	
	@Bean(name = "busBean")
	@Lazy
	public Map<Integer, Bus> getBuses(){
		
		Map<Integer, Bus> buses = new Hashtable<Integer, Bus>();
		
		  buses.put(1, bus.getObject()); buses.put(2, bus.getObject()); buses.put(3,
		  bus.getObject()); buses.put(4, bus.getObject());

		return buses;
			
	}
	
}
