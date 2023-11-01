package com.Collection.Injectiontest;


import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorClass implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object obj, String Name){
        System.out.println("Bean Before [ Initialization] .. !");
        return obj;

    }

    @Override
    public Object postProcessAfterInitialization(Object obj, String Name){
        System.out.println("Bean Before [ Destruction ] .. !");
        return obj;

    }
}
