package com.ohgiraffers.level02.normal;

public class Application2 {
    public static void main(String[] args) {

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

//        double scoreL = 80.5;
//        double scoreM = 50.6;
//        double scoreE = 70.8;
//
//        int ia = (int)scoreL;
//        int ib = (int)scoreM;
//        int ic = (int)scoreE;
//
//        System.out.println("총점 : " + (ia+ib+ic));
//        System.out.println("평균 : " + (ia+ib+ic)/3);
        // int변수로 선언함으로써 소수점 아랫자리가 자동으로 삭제된 상태로 연산이 이루어짐


        double scoreL = 80.5;
        double scoreM = 50.6;
        double scoreE = 70.8;

        System.out.println("총점 : " + (int)(scoreL+scoreM+scoreE));
        System.out.println("평균 : " + (int)(scoreL+scoreM+scoreE)/3);


        }
    }