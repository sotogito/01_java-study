package com.kyungbae.section01.interface_implements;

public class SumCalculator implements Calculator {

    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
