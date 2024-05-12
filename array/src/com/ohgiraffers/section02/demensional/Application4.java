package com.ohgiraffers.section02.demensional;

public class Application4 {
    public static void main(String[] args) {
        /* 2차원 배열의 선언과 할당 및 초기화를 동시에 할 수 있다. */

        /* 정변 배열 */
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        /* 반복문을 이용한 값 출력 */
        int value = 1;

        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }


        /* 가변 배열 */
        int[][] iarr2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9, 10}};

        /* 반복문을 이용한 값 출력 */
        int value2 = 1;
        for(int i = 0; i < iarr2.length; i++){
            for(int j = 0; j < iarr2[i].length; j++){
                iarr2[i][j] = value2++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

        /* 미리 할당한 배열을 이용한 방식 */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[][] iarr3 = {arr1, arr2};

        /* 반복문을 이용한 값 출력 */
        int value3 = 1;
        for(int i = 0; i < iarr2.length; i++){
            for(int j = 0; j < iarr2[i].length; j++){
                iarr2[i][j] = value3++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
