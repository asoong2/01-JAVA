package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2_2 {
    public static void main(String[] args) {
        System.out.println("-- 상품 가격 --");
        System.out.println("사과 : 1000원");
        System.out.println("바나나 : 3000원");
        System.out.println("복숭아 : 2000원");
        System.out.println("키위 : 5000원");

        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String something = sc.nextLine();

        int price = 0;
        String some = "";
        switch (something) {
            case "사과" :
                some = "사과";
                break;
            case "바나나" :
                System.out.println("바나나의 가격은 3000원 입니다.");
                break;
            case "복숭아" :
                System.out.println("복숭아의 가격은 2000원 입니다.");
                break;
            case "키위" :
                System.out.println("키위의 가격은 5000원 입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
                return;
    }
}
