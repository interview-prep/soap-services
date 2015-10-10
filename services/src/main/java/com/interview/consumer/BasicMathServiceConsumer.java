package com.interview.consumer;


import com.interview.practice.BasicMathService;
import com.interview.practice.BasicMathServiceImplementer;
import com.interview.practice.stub.BasicMathServiceImplementerService;

import javax.xml.ws.Endpoint;

/**
 * Created by SMALA on 10/10/2015.
 */
public class BasicMathServiceConsumer {

    public static void main(String s[]) {
        BasicMathService service = new BasicMathServiceImplementer();
        Endpoint.publish("http://localhost:1234/basicMathService", service);

        BasicMathServiceImplementerService basicMathService = new BasicMathServiceImplementerService();
        System.out.println(basicMathService.getWSDLDocumentLocation().getHost());
        System.out.println(basicMathService.getWSDLDocumentLocation().getFile());
        BasicMathService port = basicMathService.getBasicMathServiceImplementerPort();
        System.out.println("\nAdd of 10 & 10 is : " + port.add(10, 10));
        System.out.println("\nSubtraction of 20 & 10 is: " + port.subtract(20, 10));
        System.out.println("\nMultiplication of 10 & 10 is: " + port.multiply(10, 10));
        System.out.println("\nDivision of 30 & 10 is: " + port.divide(30, 10));
        System.exit(0); // Hard exit from JVM thread

    }
}
