package com.interview.practice.service.consumer;

import com.interview.practice.service.BasicMathService;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SMALA on 10/10/2015.
 */
public class WSProxyConsumer {

    public static void main(String s[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context/application-context.xml");

        BasicMathService printer = context.getBean("basicMathServiceClient");
    }
}
