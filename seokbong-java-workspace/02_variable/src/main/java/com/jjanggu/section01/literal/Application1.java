package com.jjanggu.section01.literal;

public class Application1 { // 실제클래스명 : com.jjanggu.section01.literal.Application1

    public static void main(String[] args){
        /*
            ## Java에서 취급하는 값의 종류 ##
            1. 숫자형 (정수, 실수)
            2. 문자형 (문자, 문자열)
            3. 논리형 (참 true, 거짓 false)
         */

        // 1. 숫자 : 따옴표 없이 작성
        System.out.println(123);
        System.out.println(1.23);

        // 2. 문자(한글자) : 홑따음표 같이 작성
        System.out.println('a');
//        System.out.println('abc');

        // 3. 문자열(여러글자) : 쌍따옴표 같이 작성
        System.out.println("안녕");
        System.out.println("A");

        // 4. 논리
        System.out.println(true);
        System.out.println(false);

        // 5. 연산결과 출력
        // 5-1) 숫자간의 연산결과
        System.out.println(123 + 456);
        System.out.println(1.23-0.12); // 컴퓨터에서의 실수값 전산은 불완전해서 오차가 생길 수 있음
        // *(곱샘), /(나누기의 몫), %(나누기의 나머지)

        // 5-2) 문자와 숫자간의 연산결과
        //      각 문자마다 컴퓨터가 인식하는 고유한 숫자값을 가지고 있음
        //      'a' == 97
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);

        // 5-3) 문자열과 그외 값 간의 연산 결과
        System.out.println("a" + 1); // "a1"
        System.out.println(1 + "a"); // "1a"
        System.out.println("안녕" + true); // "안녕True"
        System.out.println("안녕" + 1 + 2 + '!'); // "안녕12!"
        System.out.println("안녕" + (1 + 2) + '!');
        System.out.println(1+ "안녕" + 1 + 2 + '!');

    }

}
