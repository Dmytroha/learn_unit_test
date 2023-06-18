package org.example;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int sumResult;
        SumCalculator calculator = new SumCalculator();
        sumResult=calculator.sum(10);
        out.println(sumResult);
    }


}