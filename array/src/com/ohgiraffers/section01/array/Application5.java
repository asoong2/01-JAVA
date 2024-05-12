package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {
        /* 랜덤한 카드를 한 장 뽑아서 출력해보기 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        /* 배열 인덱스 범위의 난수 발생 */
        int randomShapeIndex = (int) (Math.random() * shapes.length);
        int randomCardNumber = (int) (Math.random() * cardNumber.length);

        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumber[randomCardNumber] + " 카드 입니다.");

    }
}
