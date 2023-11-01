package com.Collection.Injectiontest;


import java.util.Map;
import java.util.Set;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class Vehicles {
	//Field AutoWiring
	@Autowired
	@Qualifier("bikeBean")
	private List<Bike> bikes;
	@Autowired
	@Qualifier("carBean")
	private Set<Car> cars;
	@Autowired
	@Qualifier("busBean")
	private Map<Integer,Bus> buses;	
	
	
	public List<Bike> getBikes() {
		return bikes;
	}
	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	public Map<Integer, Bus> getBuses() {
		return buses;
	}
	public void setBuses(Map<Integer, Bus> buses) {
		this.buses = buses;
	}
	
}
