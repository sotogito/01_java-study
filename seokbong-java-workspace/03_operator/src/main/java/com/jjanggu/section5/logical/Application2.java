package com.jjanggu.section5.logical;

public class Application2 {
    public static void main(String[] args) {

        // 특정 정수값이 1부터 100사이의 값인지 판별
        int num = 200;

//        boolean result = (1 <= num) && (num <= 100);
        boolean result = (num >= 1) && (num <= 100); // 비교대상을 왼편에 쓰는 편

        System.out.println("정수값이 1~100 사이의 숫자입니까 : " + result);
    }
}
