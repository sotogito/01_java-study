package com.podoseee.section02.string;

import com.podoseee.section02.dto.Shop;

public class Practice2 {
    public static void main(String[] args) {
        String shopCsv = "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
                + "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
                + "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
                + "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
                + "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
                + "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
                + "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
                + "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
                + "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
                + "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";

        String[] shops = shopCsv.split("\n");
        Shop[] shopArray = new Shop[shops.length];

        for(int i=0; i<shops.length; i++){ // shops[i] == "가게번호,상호명,주소,.."
            String[] shopdata = shops[i].split(","); // {"1", "맘스쿡", ...}

            // 선생님 풀이
            /*
                shopArr[i] = new Shop(arr[0], arr[1], arr[3], arr[4], arr[5]);
             */
            int shopId = Integer.parseInt(shopdata[0]);
            String number = shopdata[0];
            String name = shopdata[1];
            String address = shopdata[2];
            String phone = shopdata[3];
            String category = shopdata[4];
            String date = shopdata[5];

            shopArray[i] = new Shop(number, name, address, phone, category, date);
        }

        for (Shop shop : shopArray) {
            System.out.println(shop);
        }


    }
}
