package com.custom.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


//@Component
public class CustomEventListenerClass extends ApplicationEvent{
	
	
//	@Autowired
	public CustomEventListenerClass(Object source) {
		super(source);
	}
	
	@Override
	public String toString() {
		return "This is from CUSTOM EVENT LISTENER";
	}
	

}
