package com.interview.practice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by SMALA on 10/10/2015.
 */
@WebService
public interface BasicMathService {
    int add(@WebParam(name = "number1") int n1, @WebParam(name = "number2") int n2);

    int subtract(@WebParam(name = "number2") int n2, @WebParam(name = "number1") int n1);

    int multiply(@WebParam(name = "number1") int n1, @WebParam(name = "number2") int n2);

    int divide(@WebParam(name = "number2") int n2, @WebParam(name = "number1") int n1);
}
