package com.inyong.section01.interface_implements;

public class Application3 {
    public static void main(String[] args) {
        /*
        인터페이스 구현 방식 3
        익명 클래스와 유사하나
        단, 구현시 오버라이딩해야되는 구문을 람다식을 통해 표현함


         */


    Calculator mod = (num1, num2) -> num1 % num2;
        System.out.println("나머지 결과 : " + mod.cal(1,2));

    }
    // 람다식을 적용하려면 해당 인터페이스에서는 오로지 한개의 추상메소드만 존재

}
