package com.interview.practice.service.consumer;


import com.interview.practice.service.consumer.stub.BasicMathService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SMALA on 10/10/2015.
 */
public class WSProxyConsumer {

    public static void main(String s[]) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/context/cxf-servlet.xml");

        BasicMathService printer = (BasicMathService) context.getBean("basicMathServiceClient");
        printer.add(10,10);
    }
}
