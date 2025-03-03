package com.homework.controller;


import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {
    @Override
    public void printNowDateTime() {
        /**
         * 1. LocalDateTime을 이용하여 현재 날짜 및 시간의 정보를 얻어 출력하는 메소드
         *    단, "2024-01-04 17:30:05"  과 같은 형식으로 출력될 수 있도록 하시오.
         *    (toString, replace, substring, indexOf 메소드 모두 사용하여 푸시오)
         */
        LocalDateTime dateTime1 = LocalDateTime.now();
        String dateTimeStr = dateTime1.toString().replace("T", " ");
        int dateTimeIndex = dateTimeStr.indexOf(".");
        String dateNow = dateTimeIndex == -1 ? dateTimeStr : dateTimeStr.substring(0, dateTimeIndex);
        System.out.println(dateNow);
    }

    @Override
    public Calendar makeCalendar(String year, String month, String date) {
        /**
         * 2. 전달받은 년도,월,일(문자열형태)을 가지고 Calendar객체에 반영시켜 반환하는 메소드
         *
         * @param year
         * @param month
         * @param date
         * @return
         */

        int myear = Integer.parseInt(year);
        int mmonth = Integer.parseInt(month) - 1;
        int mdate = Integer.parseInt(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(myear, mmonth, mdate);

        return calendar;
    }


    @Override
    public void printFormat(Calendar calc) {
        /**
         * 3. 전달받은 Calendar 객체를 가지고 아래와 같은 형식으로 출력하는 메소드
         *    "2024-01-04 목요일"
         *
         * @param calc
         */
        int year = calc.get(Calendar.YEAR);
        int month = calc.get(Calendar.MONTH) + 1;
        int day = calc.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일", Locale.KOREAN);
        String dateStr = sdf.format(calc.getTime());
        System.out.println(dateStr);

    }

    @Override
    public boolean isLeapYear(int year) {
        /**
         * 4. 전달된 년도가 윤년인지 여부값을 반환하는 메소드
         *
         * * 윤년이란?
         *   년도가 4의 배수여야하고 뿐만아니라 400의 배수이거나 100의배수가 아닌 경우를 의미한다.
         *   윤년일때는 2월이 29일까지 있다.
         *
         *   따라서 윤년은 1년이 총 366일이고
         *   그 외의 평년은 1년이 총 365일이다.
         *
         * @param year
         * @return
         */




        return false;



    }

    @Override
    public long leapDate(int startYear, int endYear) {
        return 0;
    }

    @Override
    public int sumString(String num1, String num2) {
        return 0;
    }

    @Override
    public int minusString(String num1, String num2) {
        return 0;
    }

    @Override
    public int findCharCount(String str, char ch) {
        return 0;
    }

    @Override
    public int selectTokenCount(String str) {
        return 0;
    }

    @Override
    public String toSpaceUpper(String str) {
        return "";
    }

    @Override
    public FoodShop[] csvFormat() {
        return new FoodShop[0];
    }

    // 해당 클래스안에 정의해야되는 메소드들은 현재
	// StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다. 
	// 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.
	
	public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.printNowDateTime();
    }
	
}
