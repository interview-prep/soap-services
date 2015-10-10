package com.interview.practice;

import javax.jws.WebService;

/**
 * Created by SMALA on 10/10/2015.
 */
@WebService(endpointInterface = "com.interview.practice.BasicMathService")
public class BasicMathServiceImplementer implements BasicMathService {

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtract(int n2, int n1) {
        return n2 - n1;
    }

    @Override
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int divide(int n2, int n1) {
        if (n1 != 0)
            return n2 / n1;
        return 0;
    }
}
