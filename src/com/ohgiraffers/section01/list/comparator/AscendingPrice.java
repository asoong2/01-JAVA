package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    /* sort() 메소드에서 내부적으로 사용하는 메소드이다.
     * 인터페이스를 상속 받아서 메소드 오버라이딩을 강제화 해 놓았다. */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        /* 비교 대상 두 인스턴스의 가격이 오름차순 정렬이 되기 위해서는 앞의 가격이 더 작은 가격이어야 한다.
        * 만약 뒤의 가격이 더 작은 경우에는 두 인스턴스의 순서를 바꾸어야 한다.
        * 그 때 두 값을 바꾸라는 신호로 양수를 반환하면 정렬 시 순서를 바꾸는 조건으로 사용 된다. */

        /* 양수, 음수 형태로 두 비교값이 순서를 바꿔야 하는지를 알려주기 위한 용도의 변수 */
        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {
            /* 오름차순을 위해 순서를 바꿔야 하는 경우 양수를 반환 */
            result = 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            /* 이미 오름차순 되어 있는 경우 음수를 반환 */
            result = -1;
        } else {
            /* 두 값이 같은 경우는 0을 반환 */
            result = 0;
        }

        return result;
    }

}
