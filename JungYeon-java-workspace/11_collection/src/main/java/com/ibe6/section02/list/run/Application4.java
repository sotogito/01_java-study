package com.ibe6.section02.list.run;

import com.ibe6.section02.list.comparator.AscendingTitle;
import com.ibe6.section02.list.comparator.DescendigTitle;
import com.ibe6.section02.list.dto.Music;

import java.util.*;

public class Application4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("banana", "apple", "orange", "mango", "grape");
        System.out.println("정렬전 stringList: " + stringList);

        // * Collections.sort(List<T> list) : 인자로 전달된 리스트 내의 요소들을 사전순으로 오름차순 정렬해줌
        Collections.sort(stringList);
        System.out.println("정렬후 stringList: " + stringList);

        System.out.println("=================================");

        List<Integer> integerList = Arrays.asList(7, 30, 12, 1, 23, 11);
        System.out.println("정렬전 integerList: " + integerList);

        Collections.sort(integerList);
        System.out.println("정렬후 integerList: " + integerList);

        System.out.println("=================================");

        List<Music> musicList = Arrays.asList(new Music("술이 달다", "에픽하이")
                                             ,new Music("저 밤", "양다일")
                                             ,new Music("잊혀지다", "정키")
                                             ,new Music("꺼내본다", "김나영"));
        System.out.println("정렬전 musicList: " + musicList);

        // Collections.sort 메소드 호출시 인자로 전달하는 리스트 내의
        // 모든 요소 클래스들에는 Comparable 인터페이스 구현되어있어야됨
        // 내부적으로 sort메소드 수행시 리스트 내의 요소들간에 compareTO 메소드 실행되면서 비교되고 순서가 바뀌게 되어있음
        Collections.sort(musicList);

        System.out.println("정렬후 musicList: " + musicList );

        // 매번 각기 다른 정렬기준을 제시하고자 할 경우
        // * Collections.sort(List list, Comparator C) : 인자로 전달된 리스트 내의 요소들을
//                                                        인자로 전달된 Comparatoer 클래스내의 compare 메소드를 통해 비교 정렬

        Collections.sort(musicList, new AscendingTitle());
        System.out.println("제목 오름차순 정렬후 musicList: " + musicList );

        // * List객체.sort(Comparator c) : 위와 동일
        musicList.sort(new DescendigTitle());
        System.out.println("제목 내림차순 정렬후 musicList: " + musicList);


        // * 익명클래스(Anonymous Class)
        musicList.sort(new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                return o2.getArtist().compareTo(o1.getArtist());
            }
        });
        System.out.println("가수 내림차순 정렬후 musicList: " + musicList);


        //sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
    }


}
