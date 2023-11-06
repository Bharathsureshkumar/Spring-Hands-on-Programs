package com.custom.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserDefinedEventHandler implements ApplicationListener<CustomEventListenerClass>{

	@Override
	public void onApplicationEvent(CustomEventListenerClass event) {
		
		System.out.println("Event : " + event);
		
	}

	
	
	
}
