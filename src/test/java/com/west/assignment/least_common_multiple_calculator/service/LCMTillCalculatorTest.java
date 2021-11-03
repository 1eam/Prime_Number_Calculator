package com.west.assignment.least_common_multiple_calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCMTillCalculatorTest {
    @Test
    void ResultOfOneTill2(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(2);
        assertEquals("2", result);

    }

}
