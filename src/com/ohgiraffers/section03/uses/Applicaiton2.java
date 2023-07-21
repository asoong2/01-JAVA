package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Applicaiton2 {

    public static void main(String[] args) {
        /* try with resource 구문의 문법을 이해하고 사용할 수 있다.
        * JDK 1.7에서 추가된 문법으로 close 해야 하는 인스턴스의 경우 try 옆에 괄호 안에서 생성하면
        * 해당 try catch 블럭이 완료 될 때 자동으로 close 처리해준다.
        *  */

        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
