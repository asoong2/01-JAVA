package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /* 형변환 시 데이터 손실에 유의해서 사용해야 한다. */

        /* 1. 의도하지 않은 데이터 손실 */
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum);

        /* 2. 의도한 데이터 손실 */
        double height = 175.5;
        int floorHeight = (int) height;
        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight); //소수점 절삭에 이용할 수 있다.

/*      // 100은 int, int타입은 long타입으로 대입될 때 자동 형변환이 됨
        // 100 =/= 100L
        long lnum = 100;
        // 4.0f => float
        // 4.0 => double, float타입으로 초기화 할 때에는 f를 붙여줘야함 (float < double)
        float fnum = 4.0f; */


    }
}
