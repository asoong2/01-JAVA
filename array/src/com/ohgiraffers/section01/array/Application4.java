package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램 */

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++){ //0번 인덱스부터 마지막 인덱스까지 순회
            System.out.print((i+1)+ "번 째 학생의 자바 점수 입력 : ");
            scores[i] = sc.nextInt();
        }

        double sum = 0.0;
        double avg = 0.0;

        for(int i = 0; i <scores.length; i++) {
            sum += scores[i];
        }

        avg = sum / scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);

    }
}
