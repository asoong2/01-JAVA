package com.ohgiraffers.section02.set.run;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /* TreeSet에 대해 이해하고 사용할 수 있다. */

        TreeSet<String> tset = new TreeSet<>();
        Set<String> tset2 = new TreeSet<>();

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        /* 자동 오름차순 정렬하여 이진 트리의 형태로 요소를 저장하고 있다. */
        System.out.println("tset : " + tset);

        Iterator<String> iter = tset.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        /* 로또 번호 발생기 - 정렬, 중복제거 기능을 TreeSet을 활용해서 처리 */
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add(((int)(Math.random() * 45))+1);

        }
        System.out.println("lotto : " + lotto);

    }
}
