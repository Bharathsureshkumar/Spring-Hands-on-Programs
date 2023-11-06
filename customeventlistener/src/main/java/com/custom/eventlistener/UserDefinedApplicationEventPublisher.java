package com.custom.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserDefinedApplicationEventPublisher implements ApplicationEventPublisherAware{

	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(
			org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
		
		this.publisher = publisher;
	}

	
	public void publish() {
		CustomEventListenerClass userDefinedEvent = new CustomEventListenerClass(publisher);
		
		publisher.publishEvent(userDefinedEvent);
	}
}
