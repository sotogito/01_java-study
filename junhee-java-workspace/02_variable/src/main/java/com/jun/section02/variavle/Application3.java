package com.jun.section02.variavle;

public class Application3 {

    public static void main(String[] args) {
        /*
           ## 변수 명명 규칙 ##
           1. 동일한 영역({})에는 중복된 변수 선언 불가
           2. 예약어(자바에서 이미 사용되는 키워드) 사용 불가
           3. 숫자 가능 (단, 숫자로 시작은 불가)
           4. 특수문자 가능 (단, _ $ 만 가능)
           5. 권장사항 : 영문, 낙타표기법, 의미부여하기
         */

        int age;
//        double age;

//        int true;
//        int false;
//        int void;
//        int class;
//        int public;
        int tRue;

        int num1;
        int num2;
//        int 1num;

        int num_1;
        int num$1;
        int _num1;
        int $num1;
//        int num#1;

        String 이름; // 오류는 안나지만 권장사항 x
        String username; // 두 단어를 조합할 경우 권장사항 x
        String userName; // 낙타 등 같다고 해서 낙타표기법(첫글자는 소문자)


    }
}
