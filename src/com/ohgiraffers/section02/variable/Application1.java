package com.ohgiraffers.section02.variable;

public class Application1 {

    public static void main(String[] args) {
        /* 변수를 선언하고 값을 할당하여 사용할 수 있다 */

        /* 1. 변수를 준비한다. (변수 선언) */
        /* 1-1. 변수를 선언하는 방법
                자료형 변수명; */

        /* 1-1-1. 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형은 4가지가 있다. */
        byte bnum;
        short snum;
        int inum;
        long lnum;

        /* 실수를 취급하는 자료형은 2가지가 있다. */
        float fnum;
        double dnum;

        /* 1-1-2. 문자를 취급하는 자료형 */
        char ch;

        /* 1-1-3. 논리 값을 취급하는 자료형 */
        boolean isTrue;

        /* 1-1-4. 문자열을 취급하는 자료형 */
        String str;

        /* 2. 변수에 값을 대입한다. (값 대입 및 초기화) */
        // 변수 공간 =(대입 연산자) 리터럴;
        bnum = 1;
        snum = 2;
        inum = 4;
        //lnum = 8;
        lnum = 8L;
        // 접미사 f를 붙여야 float타입이 됨
        fnum = 4.0f;
        dnum = 8.0;
        ch = 'a';
        ch = 97;
        // 똑같은 공간에 true, false를 두 번 대입한것이므로 최종적으로 false가 출력된다.
        isTrue = true;
        isTrue = false;
        str = "안녕하세요";

        /* 선언과 동시에 초기화 할 수 있다. */
        int point = 100;
        int bonus = 10;

        /* 3. 변수를 사용한다. */
        System.out.println("===== 변수에 저장된 값 출력 =====");
        System.out.println("bnum : " + bnum);
        System.out.println("snum : " + snum);
        System.out.println("inum : " + inum);
        System.out.println("lnum : " + lnum);
        System.out.println("fnum : " + fnum);
        System.out.println("dnum : " + dnum);
        System.out.println("ch : " + ch);
        System.out.println("isTrue: " + isTrue);
        System.out.println("str: " + str);

        /* 변수를 이용해서 연산하기 */
        System.out.println("포인트와 보너스의 합은? : " + (point + bonus));
        System.out.println("포인트와 보너스의 곱은? : " + point*bonus);

        /* 대입 연산자의 왼쪽과 오른쪽에 사용하기
        * 대입 연산자의 왼편은 공간이라는 의미, 오른 편은 값이라는 의미이다.*/
        // 대입 연산자 기준으로 오른쪽 내용 수행 후, 왼쪽 공간에 대입
        point = point + 100;
        System.out.println("point : " + point);









    }
}
