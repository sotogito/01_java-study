package com.ibe6.section01.exception;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        // 예외상황 2. 사용자에게 배열의 길이를 입력받아 배열 생성 => 출력시킬 인덱스수도 입력받아 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 길이: ");
        int size = sc.nextInt();

        int[] arr = new int[size]; // NegativeArraySizeException 발생가능
        System.out.println("arr: " + Arrays.toString(arr));

        System.out.print("배열 인덱스(적절한범위): ");
        int index = sc.nextInt();
        System.out.println("arr[" + index + "]: " + arr[index]); // ArrayIndexOutOfBoundsException 발생 가능

        System.out.println("프로그램을 종료합니다.");
    }
}
