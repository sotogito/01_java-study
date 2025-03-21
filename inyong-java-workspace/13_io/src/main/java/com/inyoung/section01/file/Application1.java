package com.inyoung.section01.file;

import java.io.File;

public class Application1 {
    public static void main(String[] args) {
        /*
        ## java.io.File ##
        1. 디렉토리 및 파일을 관리하는 클래스
        2. 특정 디렉토리 및 파일을 만들고 삭제할 수 있음
        3. 특정 디렉토리 및 ㅍ ㅏ일의 정보를 확인할 수 있음
        (이름, 경로, 크기, 최종수정일 등)
         */

        // 1. 디렉토리 만들기
        // 1 ) File 인스턴스 생성
        File dir = new File("/Users/in-yong/storage");

        // exists() : 해당 디렉토리 및 파일의 존재 여부 반환
        System.out.println(dir.exists());

        // 2 ) 존재하지 않을 경우 생성
        if( !dir.exists() ){
            // mkdir() / mkdirs() - 하위폴더까지 다수 만들때 : 디렉토리 생성
            dir.mkdirs();
        }
        System.out.println(dir.exists());
    }
}