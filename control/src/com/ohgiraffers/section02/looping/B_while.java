package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement() {
        /* while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 1부터 10까지 1씩 증가시키면서 i 값을 10번 출력하는 반복문 */

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++; //증감식이 없으면 1은 영원히 10보다 작아서 무한루프 발생

        }

    }

    public void testWhileExample1() {
        /* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /*charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
        * length() : String 클래스의 메소드로 문자열의 길이를 int 형으로 변환하는 기능
        * index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
        * 존재하지 않는 인덱스에 접근 시 StringIndexOutBoundsException이 발생한다. */

        int index = 0;
        while (index < str.length()){ // ex) apple -> str.length = 5 index는 01234, 즉 5미만
            char ch = str.charAt(index);
            System.out.println(index + " : " + ch);
            index++;
        }

        /* for문 */
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }


    }

    public void testWhileExample2 () {
        /* 정수 하나를 입력 받아 1부터 입력 받은 정수까지의 합계 구하기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int num = sc.nextInt();

        int sum = 0; //합계를 저장해둘 변수공간
        int i = 1; // 1부터 시작할 초기값
        while(i <= num){
            sum += i++;
        }
        System.out.println("1부터 입력 받은 정수 " + num + "까지의 합은 " + sum + "입니다.");

    }

    public void testWhileExample3() {
        /* 중첩 while문을 이용한 구구단 출력 */

        int dan = 2;
        while(dan < 10) { // 단
            int su = 1; // 초기식의 위치가 중요함
            while(su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
                su++;
            }
            dan++;
        }
    }



}
