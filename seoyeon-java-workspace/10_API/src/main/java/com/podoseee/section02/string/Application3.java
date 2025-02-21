package com.podoseee.section02.string;

public class Application3 {
    public static void main(String[] args) {
        // 문자열 생성하는 방법
        // 1. 문자열 객체 : new String("문자열")
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2.toString());
        // String 클래스에서 toString 메소드 이미 오버라이딩 해놨음 (실제 담긴 문자열 반환하도록)

        System.out.println(str1 == str2); // false (주소값 비교)
        System.out.println(str1.equals(str2)); // true
        // String 클래스에서 equals 메소드 이미 오버라이딩 해놨음 (주소값 비교가 아닌 실제 담긴 문자열간 비교)

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        // String 클래스에서 hashCode 메소드 이미 오버라이딩 해놨음 (주소값이 아닌 실제 담긴 문자열가지고 만듦)

        // 정말 주소값이 다른지를 확인하고자 할 경우 => System.identityHashCode(레퍼런스)
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        // 2. 문자열 리터럴 : "문자열"
        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println(str3 == str4); // true (주소값 일치함)

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        /*
            ## 문자열 리터럴 ##
         */
    }
}
