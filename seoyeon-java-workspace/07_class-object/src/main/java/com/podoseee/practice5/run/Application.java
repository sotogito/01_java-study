package com.podoseee.practice5.run;

import com.podoseee.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤
        Employee[] emp = new Employee[3];
        // 0번 인덱스에는 기본생성자를 통해서 객체 생성
        emp[0] = new Employee();
        // 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
        emp[1] = new Employee(1, "홍길동", 19, "M", "01022223333", "서울 잠실");
        // 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
        emp[2] =  new Employee(2, "강말순", "교육부", "강사", 20, "F", 1000000, 0.01, "01011112222", "서울 마곡");

        System.out.println("emp[0] : " + emp[0]);
        System.out.println("emp[1] : " + emp[1]);
        System.out.println("emp[2] : " + emp[2]);

        System.out.println("===============================================================");

        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
        emp[0].setName("김말똥");
        emp[0].setDepartment("영업부");
        emp[0].setPosition("팀장");
        emp[0].setAge(30);
        emp[0].setGender("M");
        emp[0].setSalary(3000000);
        emp[0].setBonusPoint(0.2);
        emp[0].setPhone("01055559999");
        emp[0].setAddress("전라도 광주");

        emp[1].setDepartment("기획부");
        emp[1].setPosition("부장");
        emp[1].setSalary(4000000);
        emp[1].setBonusPoint(0.3);

        System.out.println("emp[0] : " + emp[0]);
        System.out.println("emp[1] : " + emp[1]);

        System.out.println("===============================================================");

        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력

        System.out.println(emp[0].getName() + "의 연봉 : " + emp[0].getAnnualSalary() + "원");
        System.out.println(emp[1].getName() + "의 연봉 : " + emp[1].getAnnualSalary() + "원");
        System.out.println(emp[2].getName() + "의 연봉 : " + emp[2].getAnnualSalary() + "원");

        System.out.println("===============================================================");

        // 보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12

        int totalSalary = emp[0].getAnnualSalary() + emp[1].getAnnualSalary() + emp[2].getAnnualSalary();
        int averageSalary = totalSalary / emp.length;

        // 3명 직원의 연봉 평균을 구하여 출력
        System.out.println("직원들의 연봉의 평균 : " + averageSalary + "원");

    }
}
