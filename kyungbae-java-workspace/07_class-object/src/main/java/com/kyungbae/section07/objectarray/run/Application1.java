package com.kyungbae.section07.objectarray.run;

import com.kyungbae.section07.objectarray.dto.Car;

public class Application1 {
    public static void main(String[] args) {

        // 5대의 자동차 인스턴스 관리 (각 인스턴스들을 따로 변수로 관리)

        Car car1 = new Car("911", "포르쉐", 300);
        Car car2 = new Car("아벤타도르", "람보르기니", 350);
        Car car3 = new Car("720S", "맥라렌", 320);
        Car car4 = new Car("아반떼", "현대", 200);
        Car car5 = new Car("K5", "기아", 250);

        System.out.println(car1.getInformation());
        System.out.println(car2.getInformation());
        System.out.println(car3.getInformation());
        System.out.println(car4.getInformation());
        System.out.println(car5.getInformation());

        int sum = car1.getMaxSpeed() + car2.getMaxSpeed() + car3.getMaxSpeed()
                + car4.getMaxSpeed() + car5.getMaxSpeed();
        System.out.println("평균최대속도 : " + (sum / 5));

        System.out.println("=======================================");

        // Car 타입의 인스턴스 주소들을 보관할 5칸짜리의 배열 할당
        Car[] carArr1 = new Car[5]; // 0~4 index의 배열요소마다 Car 타입 (처음에는 null로 초기화)

        // carrArr1 배열 요소에 각 인스턴스 생성해서 대입

        carArr1[0] = new Car("911", "포르쉐", 300);
        carArr1[1] = new Car("아벤타도르", "람보르기니", 350);
        carArr1[2] = new Car("720S", "맥라렌", 320);
        carArr1[3] = new Car("아반떼", "현대", 200);
        carArr1[4] = new Car("K5", "기아", 250);
        // 2차원 배열의 형태로 생성됨

        int sum2 = 0;
        for (int i = 0; i < carArr1.length; i++) {
            System.out.println(carArr1[i].getInformation());
            sum2 += carArr1[i].getMaxSpeed();
        }
        System.out.println("평균 최대 속도 : " + sum2 / carArr1.length);

        System.out.println("======================================");

        // 생성과 동시에 대입
        Car[] carArr2 = {
                new Car("R8", "아우디", 300)
              , new Car("X5", "BMW", 200)
              , new Car("머스탱", "포드", 250)
        };

        // 향상된 for문도 가능
        int sum3 = 0;
        for (Car c : carArr2){
            System.out.println(c.getInformation());
            sum3 += c.getMaxSpeed();
        }
        System.out.println("평균 = " + sum3 / carArr2.length);

    }
}
