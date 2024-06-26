package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {
        /* 예외 처리를 많이 사용하는 io 패키지에서 예외 처리를 사용하는 구문을 이해할 수 있다. */

        /* 아직 io는 배우지 않았지만 io 문법보다 try-catch 블럭의 실제 사용과 흐름에 집중해서 학습한다. */
        BufferedReader in = null;

        try {
            /* FileReader 생성자를 확인하면 throws FileNotFoundException 으로 되어 있으므로
            * 사용하는 쪽에서 반드시 예외 처리를 하며 try catch 블럭 안에서 생성자를 호출하도록 한다. */
            in = new BufferedReader(new FileReader("test.dat"));

            String s;

            /* readLine() 메소드를 확인하면 throws IOException 으로 되어 있으므로
            * 해당 예외에 대해서도 예외 처리를 해주어야 한다. */
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            /* IOException은 입출력에 관해 추상화 된 예이 클래스로 FileNotFoundException도 IOExcption의 후손이다. */
            e.printStackTrace();
        } finally {
            /* 보통 io에서 사용한 자원을 반납할 목적으로 사용한다. */
            try {
                /* 입출력에 사용한 스트림을 닫아주는 메소드로 throws IOException 처리 되어 있는 메소드이기 때문에
                * finally 블럭 안이라도 다시 예외 처리를 중첩으로 해주어야 한다. */

                /* NullPointException은 RuntimeException의 후손으로 예외 처리가 강제회 되어 있지 않다.
                * 대신 코드를 통해 확인하고 수행하도록 처리하면 되는데 null 여부를 확인한 뒤 수행하도록 한다. */
                if(in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
