package com.javapep.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

@Override
public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	// TODO Auto-generated method stub
	return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
}
}
